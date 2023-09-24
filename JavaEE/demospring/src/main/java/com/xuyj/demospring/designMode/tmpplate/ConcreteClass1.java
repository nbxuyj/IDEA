package com.xuyj.demospring.designMode.tmpplate;

public class ConcreteClass1  extends AbstractClass {

    @Override
    protected void customOperation() {
        // 具体模板1 业务逻辑
        System.out.println("具体模板1：customOperation()");
    }
}
