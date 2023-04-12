package com.xuyj.platform.common.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"modifytime", Date.class,new Date());
        this.strictInsertFill(metaObject,"rowversion", Integer.class,0);
        this.strictInsertFill(metaObject,"rowflag", Integer.class,0);

    }
    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject,"modifytime", Date.class,new Date());
    }
}