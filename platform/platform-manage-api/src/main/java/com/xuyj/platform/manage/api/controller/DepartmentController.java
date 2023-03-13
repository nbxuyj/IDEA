package com.xuyj.platform.manage.api.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuyj.plateform.common.entity.ResultMessage;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.manage.api.entity.DepListParam;
import com.xuyj.platform.manage.api.entity.PageResult;
import com.xuyj.platform.service.DepartmentService;
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
    public PageResult<Department> getDepartmentList(@RequestBody @ApiParam(value = "参数类", required = true) DepListParam p) {

        Page<Department> page = new Page<>(p.getPageNumber(), p.getPageSize());
        Department dep = new Department();
        dep.setDepartmentname(p.getDepName());
        Page<Department> page1 = departmentService.mySelectAll(page, dep);
        PageResult<Department> res=new PageResult<>();
        res.setTotalCount(page1.getTotal());
        res.setResult(page1.getRecords());
        return res;
    }


}
