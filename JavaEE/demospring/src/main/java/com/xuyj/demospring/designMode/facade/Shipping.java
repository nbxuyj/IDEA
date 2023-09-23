package com.xuyj.demospring.designMode.facade;

/**
 * 处理发货
 */
class Shipping {
    public void shipOrder(String shippingDetails) {
        System.out.println("处理发货Shipping order to: " + shippingDetails);
    }
}