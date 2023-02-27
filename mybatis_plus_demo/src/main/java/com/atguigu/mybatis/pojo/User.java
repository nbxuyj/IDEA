package com.atguigu.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

@Data
public class User {
    //@TableId("uid") ASSIGN_ID 雪花算法 ASSIGN_UUID GUID

    @TableId(value = "uid",type = IdType.AUTO)
    private Long uid;
    @TableField
    private String name;
    private  Integer age;
    private  String email;
    @TableLogic
    private Integer isDeleted;

    public User(Long id, String name, Integer age, String email) {
        this.uid = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public  User(){

    }
}
