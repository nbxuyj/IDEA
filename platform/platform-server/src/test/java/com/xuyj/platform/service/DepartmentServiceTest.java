package com.xuyj.platform.service;

import com.xuyj.platform.db.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DepartmentServiceTest {
    @Autowired
    EmployeeService employeeService;
    @Test
    public  void Test1(){
        Employee byId = employeeService.getById(1);
        System.out.printf("byid"+byId.getLastname());
    }
}