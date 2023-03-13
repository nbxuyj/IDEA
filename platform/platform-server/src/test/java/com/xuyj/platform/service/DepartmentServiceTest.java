package com.xuyj.platform.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuyj.platform.db.entity.Department;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;


@SpringBootTest
class DepartmentServiceTest {
    @Resource
    DepartmentService departmentService;
    @Test
    void batchInsert() {
        ArrayList<Department> deps = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Department dep = new Department();
            dep.setDepartmentname("部门" + i);
            deps.add(dep);
        }
        departmentService.saveBatch(deps);
    }

    @Test
    void selectAll() {
        Page<Department> page=new Page<>(1,10);
        Department dep=new Department();
        dep.setDepartmentname("9");
        Page<Department> page1 = departmentService.mySelectAll(page, dep);
        Integer i=10;
    }
}