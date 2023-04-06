package com.xuyj.springboot.entity;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import java.math.BigDecimal;

@Entity
@Data
public class Student {
    public Student() {

    }

    @Id
    @GeneratedValue //自增
    private Integer id; //学号ip
    @NotNull(message = "姓名为空")
    private String name;//姓名
    @NotNull(message = "性别为空")
    private String sex; //性别
    @NotNull(message = "年龄为空")
    private Integer age; //年龄
    @NotNull(message = "学费为空")
    private BigDecimal fee; //学费

}
