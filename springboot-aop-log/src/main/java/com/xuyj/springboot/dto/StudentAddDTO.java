package com.xuyj.springboot.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
@Data
public class StudentAddDTO {
    @NotNull(message = "姓名为空")
    private String name;//姓名
    @NotNull(message = "性别为空")
    private String sex; //性别
    @NotNull(message = "年龄为空")
    private Integer age; //年龄
    @NotNull(message = "学费为空")
    private BigDecimal fee; //学费
}
