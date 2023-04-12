package com.xuyj.platform.db.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;

import static com.baomidou.mybatisplus.annotation.IdType.ASSIGN_UUID;

@Data
public class BaseEntity {
    /**
     *
     */
    @TableId(type = ASSIGN_UUID)
    private String guid;
    /**
     *
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date modifytime;
    /**
     *
     */

    @TableField(fill = FieldFill.INSERT)
    private Integer rowversion;
    /**
     *
     */
    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer rowflag;
}
