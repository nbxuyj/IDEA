package com.atguigu.mybatis.pojo;

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
    @TableField
    private String userName;
    private  Integer age;
    private  String email;
    @TableLogic
    private Integer isDeleted;

    public User(Long id, String name, Integer age, String email) {
        this.id = id;
        this.userName = name;
        this.age = age;
        this.email = email;
    }

    public  User(){

    }
}
