package com.xuyj.platform.manage.api.controller;

import com.xuyj.platform.common.entity.ResultMessage;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.service.DepartmentService;
import com.xuyj.platform.service.cache.DepartmentServiceCache;
import com.xuyj.platform.service.entity.DepartmentListParam;
import com.xuyj.platform.service.entity.PageResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/dep")
@Api("部门类")

public class DepartmentController {
    @Resource
    DepartmentServiceCache serviceCache;
    @Resource
    DepartmentService service;

    @ApiOperation("获取列表")
    @PostMapping("/list")
    @ResponseBody
    //分页查询所有数据
    public ResultMessage<PageResult<Department>> getDepartmentList(@RequestBody @ApiParam(value = "参数类") DepartmentListParam p) {
        return new ResultMessage().toSuccess (serviceCache.mySelectAll(p));

    }
    @PostMapping("/cachelist")
    public ResultMessage<List<Department>> getCache(){
        return new ResultMessage().toSuccess(serviceCache.mySelectAll(null));
    }

    @GetMapping("/{id}")
    public Department getDep(@PathVariable("id") Integer id){
     return  serviceCache.getDep(id);

    }

}
