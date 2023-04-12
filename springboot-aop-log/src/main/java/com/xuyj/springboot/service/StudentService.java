package com.xuyj.springboot.service;

import com.xuyj.springboot.config.SysDbLog;
import com.xuyj.springboot.entity.Student;
import com.xuyj.springboot.enums.OperEnum;
import com.xuyj.springboot.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class StudentService {
    @Resource
    StudentRepository studentRepository;

    /**
     * 查询所有
     * @return
     */
    public List getList(){
        return  studentRepository.findAll();
    }
    /**
     * 插入实体
     *
     * @param entity
     * @return
     */
    @SysDbLog(value = "新增" )
    public Student Insert(Student entity) {
        return studentRepository.save(entity);
    }

    /**
     * 删除实体
     *
     * @param id
     * @return
     */
    @SysDbLog(value = "删除")
    public Integer Delete(Integer id) {
        studentRepository.deleteById(id);
        return 1;
    }
}
