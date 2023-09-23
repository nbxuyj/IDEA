package com.xuyj.demospring.designMode.builder;

import com.xuyj.demospring.designMode.builder.pojo.Product;

/**
 * Director.java
 *  指挥者
 */
public class Director {
    //指挥工人按顺序造房
    public Product create(Builder builder) {
        builder.bulidB();
        builder.bulidA();

        builder.bulidC();
        builder.bulidD();
        return builder.getProduct();
    }
}