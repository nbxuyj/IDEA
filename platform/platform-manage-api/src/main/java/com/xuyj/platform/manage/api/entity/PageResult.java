package com.xuyj.platform.manage.api.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;
@Data
public class PageResult<T> {
    /**
     * 总记录数
     */
    @ApiModelProperty("总记录数")
    Long totalCount;
    /**
     * 数据集合
     */
    @ApiModelProperty("数据体")
    List<T> Result;
}
