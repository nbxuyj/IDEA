package com.xuyj.springboot.controller;

import com.xuyj.springboot.entity.Student;
import com.xuyj.springboot.repository.StudentRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = "学生接口")
public class StudentController {
    @Autowired
    private StudentRepository repository;

    /**
     * 1.获取学生的所有信息。
     */
    @ApiOperation("查询列表")
    @GetMapping("/student")
    public List<Student> getAll() {
        return repository.findAll();

    }

    @ApiOperation("新增数据")

    @PostMapping("/students")
    public Student Insert(@RequestParam("name") String name, @RequestParam("sex") String sex, @RequestParam("fee") BigDecimal fee) {
        Student student = new Student();
        student.setName(name);
        student.setSex(sex);
        student.setFee(fee);
        student.setAge(10);
        return repository.save(student);
    }

    @ApiOperation("通过主键查询单条数据")
    @GetMapping("/Students/{id}")
    public Student findById(@PathVariable("id") Integer id) {
        return repository.findById(id).orElse(null);
    }

    @ApiOperation("修改数据")
    @PutMapping("students/{id}")
    public Student update(@RequestParam("id") Integer id,
                          @RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "sex", required = false) String sex,
                          @RequestParam(value = "fee", required = false) BigDecimal fee) {
        //1.找到学生。
        Optional<Student> optional = repository.findById(id);
        Student student;
        if (optional.isPresent()) {
            student = optional.get();
        } else {
            return null;
        }
//        if (name != null) student.setName(name);
//        if (sex != null) student.setSex(sex);
//        if (fee != null) student.setFee(fee);

        student.setName(name);
        student.setSex(sex);
        student.setFee(fee);
        student.setAge(10);
        return repository.save(student);
    }

}

