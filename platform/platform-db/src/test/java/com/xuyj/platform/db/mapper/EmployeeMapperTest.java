package com.xuyj.platform.db.mapper;

import com.xuyj.platform.db.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeMapperTest {
    @Resource
    EmployeeMapper employeeMapper;
    @Test
    public  void test1(){

        Employee employee = employeeMapper.selectById(1);
        System.out.println(employee.getLastname());
    }

}