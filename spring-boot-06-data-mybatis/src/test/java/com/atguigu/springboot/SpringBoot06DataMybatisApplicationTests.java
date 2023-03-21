package com.atguigu.springboot;
import com.atguigu.springboot.bean.*;
import com.atguigu.springboot.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot06DataMybatisApplicationTests {

    @Autowired
    EmployeeMapper employeeMapper;


    @Test
    void contextLoads() {
        Employee emp = employeeMapper.getEmpById(1);
        System.out.println(emp.getId());
    }

}
