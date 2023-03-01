package com.atguigu.mybatis.pojo;

import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
public class Product {
    private Long id;
    private String name;
    private Integer price;
    //@Version //标识乐观锁标识。
    private Integer version;

}
