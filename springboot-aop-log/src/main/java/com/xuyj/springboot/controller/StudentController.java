package com.xuyj.springboot.controller;

import com.xuyj.springboot.entity.Student;
import com.xuyj.springboot.repository.StudentRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "学生接口")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    /**
     * 1.获取学生的所有信息。
     */
    @ApiOperation("查询列表")
@GetMapping("/student")
    public List<Student> getAll(){
    return  repository.findAll();

}

}

