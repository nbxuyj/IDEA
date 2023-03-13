package com.xuyj.platform.manage.api.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuyj.plateform.common.entity.ResultMessage;
import com.xuyj.platform.db.entity.Department;
import com.xuyj.platform.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/dep")
public class DepartmentController {
    @Resource
    DepartmentService departmentService;

    @GetMapping("/list")
    //分页查询所有数据
    public Page<Department> getDepartmentList(Page<Department> page, Department dep) {
        return  departmentService.mySelectAll(page,dep);
    }
}
