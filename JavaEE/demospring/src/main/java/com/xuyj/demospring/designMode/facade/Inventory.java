package com.xuyj.demospring.designMode.facade;

/**
 * 管理库存
 */
public class Inventory {
    public boolean isAvailable(String productId) {
        System.out.println("检查产品库存Checking inventory for product: " + productId);
        return true;
    }
}
