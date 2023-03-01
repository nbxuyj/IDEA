package com.atguigu.mybatis.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum SexEnum {

    MALE(1, "男"),

    FEMALE(2, "女");
    @EnumValue //将注解所标识的属性的值存储到数据库中。另在配置中扫描枚举。
    private Integer sex;
    private String sexName;

    SexEnum(Integer sex, String sexName) {
        this.sex = sex;
        this.sexName = sexName;
    }
}
