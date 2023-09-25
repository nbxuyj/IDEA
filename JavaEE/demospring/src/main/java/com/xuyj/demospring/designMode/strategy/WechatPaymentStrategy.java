package com.xuyj.demospring.designMode.strategy;

import java.math.BigDecimal;

public class WechatPaymentStrategy implements PaymentStrategy{
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用微信支付" + amount);
        // 调用微信支付API
    }
}
