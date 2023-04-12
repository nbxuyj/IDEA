package com.xuyj.platform.manage.api.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.mysql.cj.util.StringUtils;
import com.xuyj.platform.db.entity.Sysparam;
import com.xuyj.platform.service.SysparamService;
import com.xuyj.platform.service.entity.PageResult;
import com.xuyj.platform.service.entityDTO.request.Sysparam.SysparamAddDto;
import com.xuyj.platform.service.entityDTO.request.Sysparam.SysparamEditDto;
import com.xuyj.platform.service.entityDTO.request.Sysparam.SysparamPageDto;
import com.xuyj.platform.service.entityDTO.response.Sysparam.SysparamDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;
import com.xuyj.platform.common.entity.ResultMessage;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

/**
 * (Sysparam)表控制层
 *
 * @author makejava
 * @since 2023-04-12 09:21:21
 */
@Api(tags = "Sysparam接口")
@RestController
@RequestMapping("sysparam")
public class SysparamController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private SysparamService sysparamService;

    /**
     * 分页查询所有数据
     *
     * @return 所有数据
     */
    @ApiOperation("获取列表")
    @PostMapping("list")
    public ResultMessage<PageResult<Sysparam>> selectAll(@RequestBody SysparamPageDto param) {

        LambdaQueryWrapper<Sysparam> mp = new LambdaQueryWrapper<>();
        //按名称查询
        mp.like(param != null && !StringUtils.isNullOrEmpty(param.getGuid()), Sysparam::getGuid, param.getGuid());
        //TODO:按需补充。
        PageResult<Sysparam> page = new PageResult<>(param.getPageNumber(), param.getPageSize());
        PageResult<Sysparam> doPages = sysparamService.getBaseMapper().selectPage(page, mp);

        PageResult voPages = new PageResult<SysparamDto>(doPages.getCurrent(), doPages.getSize(), doPages.getTotal(), doPages.searchCount());
        List<Sysparam> vos = new ArrayList<>();
        for (Sysparam doItem : doPages.getRecords()) {
            SysparamDto voItem = new SysparamDto();
            BeanUtils.copyProperties(doItem, voItem);
            vos.add(voItem);
        }
        voPages.setRecords(vos);
        return new ResultMessage().toSuccess(voPages);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过主键查询单条数据")
    @GetMapping("{id}")
    public ResultMessage<SysparamDto> selectOne(@ApiParam(value = "主键") @PathVariable Serializable id) {
        Sysparam doInfo = sysparamService.getById(id);
        SysparamDto dto = new SysparamDto();
        BeanUtils.copyProperties(doInfo, dto);
        return new ResultMessage().toSuccess(dto);
    }

    /**
     * 新增数据
     *
     * @param addDto 实体对象
     * @return 新增结果
     */
    @ApiOperation("新增数据")
    @PostMapping("insert")
    public ResultMessage<Integer> insert(@ApiParam(value = "实体对象") @RequestBody SysparamAddDto addDto) {
        Sysparam dto = new Sysparam();
        BeanUtils.copyProperties(addDto, dto);
        //TODO:按需补充。
        //dto.setUnitid("");
        boolean b = sysparamService.save(dto);
        return new ResultMessage().toSuccess(b ? 1 : 0);
    }

    /**
     * 修改数据
     *
     * @param editDto 实体对象
     * @return 修改结果
     */
    @ApiOperation("修改数据")
    @PostMapping("update")
    public ResultMessage<Integer> update(@ApiParam(value = "实体对象") @RequestBody SysparamEditDto editDto) {
        Sysparam dto = new Sysparam();
        BeanUtils.copyProperties(editDto, dto);
        boolean b = sysparamService.updateById(dto);
        return new ResultMessage().toSuccess(b ? 1 : 0);
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @ApiOperation("删除数据")
    @PostMapping("delete")
    public ResultMessage<Integer> delete(@ApiParam(value = "主键集合") @RequestParam("idList") List<String> idList) {
        boolean b = sysparamService.removeByIds(idList);
        return new ResultMessage().toSuccess(b ? 1 : 0);
    }
}

