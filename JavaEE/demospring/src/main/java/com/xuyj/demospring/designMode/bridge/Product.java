package com.xuyj.demospring.designMode.bridge;

/**
 * 产品抽象类
 */
public abstract class Product {
    /**
     * 不管什么产品，都要生产。
     */
    public  abstract  void make();

    /**
     * 不管什么产品，都要销售
     */
    public  abstract  void sell();
}
