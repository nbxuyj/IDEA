package com.atguigu.springboot.entity;

import javax.persistence.*;

//使用JPA注解配置映射表
@Entity //告诉JPA这是一个实体类，和数据表映射的类。
@Table(name = "tbl_user") //可以省略，默认类名的小写
public class User {
    @Id//表示这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增主键
    private Integer id;

    @Column(name = "last_name", length = 50)
    private String lastName;
    @Column //省略默认列名就是属性名。
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
