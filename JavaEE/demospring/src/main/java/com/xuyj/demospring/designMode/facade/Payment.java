package com.xuyj.demospring.designMode.facade;

/**
 * 处理付款
 */
class Payment {
    public boolean processPayment(String paymentDetails) {
        System.out.println("处理付款Processing payment: " + paymentDetails);
        return true;
    }
}
