package com.xuyj.springboot.controller;

import com.xuyj.springboot.dto.StudentAddDTO;
import com.xuyj.springboot.entity.Student;
import com.xuyj.springboot.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Api(tags = "学生接口V2")
@RequestMapping("/stu")
public class StudentV2Controller {
    @Resource
    StudentService service;
    @ApiOperation("获取列表")
    @PostMapping("list")
    public List getList(){
        return service.getList();
    }
    @ApiOperation("新增数据")
    @PostMapping("insert")
    public Student insert(@RequestBody StudentAddDTO addDto){
        Student dto=new Student();
        BeanUtils.copyProperties(addDto, dto);
        return  service.Insert(dto);
    }
    @ApiOperation("删除数据")
    @PostMapping("delete")
    public Integer delete(@ApiParam(value = "主键集合") @RequestParam("idList") Integer id){
        return  service.Delete(id);
    }


}
