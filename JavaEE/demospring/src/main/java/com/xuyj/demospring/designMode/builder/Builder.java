package com.xuyj.demospring.designMode.builder;

import com.xuyj.demospring.designMode.builder.pojo.Product;

abstract class Builder {
    //地基
    abstract void bulidA();
    //钢筋工程
    abstract void bulidB();
    //铺电线
    abstract void bulidC();
    //粉刷
    abstract void bulidD();
    //完工-获取产品
    abstract Product getProduct();
}
