package com.xuyj.platform.manage.api.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuyj.plateform.common.entity.ResultMessage;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.service.DepartmentService;
import com.xuyj.platform.service.entity.DepartmentListParam;
import com.xuyj.platform.service.entity.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dep")
@Api("部门类")
public class DepartmentController {
    @Resource
    DepartmentService departmentService;

    @ApiOperation("获取列表")
    @PostMapping("/list")
    @ResponseBody
    //分页查询所有数据
    public ResultMessage<PageResult<Department>> getDepartmentList(@RequestBody @ApiParam(value = "参数类") DepartmentListParam p) {
        return new ResultMessage().toSuccess (departmentService.mySelectAll(p));

    }


}
