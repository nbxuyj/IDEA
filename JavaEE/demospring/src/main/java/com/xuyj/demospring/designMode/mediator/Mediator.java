package com.xuyj.demospring.designMode.mediator;

/**
 * 抽象中介者
 */
public  abstract  class Mediator {
    /**
     * 注册
     * @param colleague
     */
    public abstract void register(Colleague colleague);

    /**
     * 转发
     * @param cl
     */

    public abstract void relay(Colleague cl); //转发
}
