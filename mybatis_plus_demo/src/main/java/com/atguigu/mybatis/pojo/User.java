package com.atguigu.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.*;

@Data
public class User {
    //@TableId("uid") ASSIGN_ID 雪花算法 ASSIGN_UUID GUID
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    private  Integer age;
    private  String email;

    public User(Long id, String name, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public  User(){

    }
}
