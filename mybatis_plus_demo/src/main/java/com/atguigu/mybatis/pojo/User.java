package com.atguigu.mybatis.pojo;

import com.atguigu.mybatis.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

@Data
public class User {
    //@TableId("uid") ASSIGN_ID 雪花算法 ASSIGN_UUID GUID

//    @TableId(value = "uid",type = IdType.AUTO)
    //将属性对应的字段指定为主键。 type表示主键生成的策略。



    //@TableId(value = "uid",type = IdType.AUTO)
    @TableId(value = "uid")
    private Long id;
    @TableField("user_name")
    private String name;
    private  Integer age;
    private  String email;
    private SexEnum sex;
    @TableLogic
    private Integer isDeleted;

    public User(Long id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public  User(){

    }
}
