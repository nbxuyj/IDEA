package com.xuyj.platform.manage.api.controller;

import com.xuyj.platform.db.entity.Department;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentService {
    //分页查询所有数据
    public List<Department> SelectAll(){
        return new ArrayList<>();
        
    }
}
