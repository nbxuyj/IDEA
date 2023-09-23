package com.xuyj.demospring.designMode.bridge;

public class Corp {
    // 我要生产服装
    private Product product;

    public Corp(Product product) {
        this.product = product;
    }
    // 公司是用来挣钱的
    public void makeMoney(){
        this.product.make();
        this.product.sell();
    }

}
