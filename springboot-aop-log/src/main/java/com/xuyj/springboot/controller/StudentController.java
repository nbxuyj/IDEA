package com.xuyj.springboot.controller;

import com.xuyj.springboot.entity.Student;
import com.xuyj.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository repository;

    /**
     * 1.获取学生的所有信息。
     */
@GetMapping("/student")
    public List<Student> getAll(){
    return  repository.findAll();

}

}

