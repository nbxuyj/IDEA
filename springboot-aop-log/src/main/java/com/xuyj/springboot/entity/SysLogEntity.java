package com.xuyj.springboot.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class SysLogEntity {
    @Id
    @GeneratedValue //自增
    private Integer id; //学号ip
    private String className;
    private String methodName;
    private String params;
    private Long exeuTime;
    private String remark;
    private String createDate;
}