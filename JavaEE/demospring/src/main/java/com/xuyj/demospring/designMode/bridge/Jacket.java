package com.xuyj.demospring.designMode.bridge;

public class Jacket extends  Product {
    @Override
    public void make() {
        System.out.println("生产外套恰克");
    }

    @Override
    public void sell() {
        System.out.println("外套恰克卖出去啦...");
    }

}
