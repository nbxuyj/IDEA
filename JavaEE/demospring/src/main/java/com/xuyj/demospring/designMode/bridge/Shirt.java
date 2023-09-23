package com.xuyj.demospring.designMode.bridge;

public class Shirt extends  Product {
    @Override
    public void make() {
        System.out.println("生产内衣衬衫");
    }

    @Override
    public void sell() {
        System.out.println("内衣衬衫卖出去啦...");
    }
}
