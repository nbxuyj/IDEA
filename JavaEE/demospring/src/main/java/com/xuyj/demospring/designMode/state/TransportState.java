package com.xuyj.demospring.designMode.state;

public class TransportState implements LogisticsState {
    @Override
    public void doAction(JdLogistics context) {
        System.out.println("商品已正在运输...");
    }
}

