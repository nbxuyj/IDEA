package com.xuyj.demospring.designMode.builder;

import com.xuyj.demospring.designMode.builder.pojo.Product;

/**
 * 具体的建造者
 */
public class ConcreteBuilder extends Builder {
    private Product product;
    public ConcreteBuilder() {
        product = new Product();
    }
    @Override
    void bulidA() {
        product.setBuildA("地基");
    }

    @Override
    void bulidB() {
        product.setBuildB("钢筋工程");
    }

    @Override
    void bulidC() {
        product.setBuildC("铺电线");
    }

    @Override
    void bulidD() {
        product.setBuildD("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
