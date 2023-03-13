package com.xuyj.platform.manage.api.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuyj.plateform.common.entity.ResultMessage;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.service.DepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/dep")
@Api("部门类")
public class DepartmentController {
    @Resource
    DepartmentService departmentService;

    @ApiOperation("获取列表")
    @GetMapping("/list")
    //分页查询所有数据
    public Page<Department> getDepartmentList(@ApiParam(value = "部门分页", required = true) Page<Department> page, @ApiParam(value = "部门查询条件", required = true) Department dep) {
        Page<Department> page1 = departmentService.mySelectAll(page, dep);
        return page1;
    }


}
