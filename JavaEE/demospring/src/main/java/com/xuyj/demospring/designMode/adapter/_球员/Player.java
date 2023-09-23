package com.xuyj.demospring.designMode.adapter._球员;

/**
 * 抽象球员类
 */
public abstract class Player {

    /**
     * 球员名字
     */
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    /**
     * 进攻方法
     */
    public abstract void attack();

    /**
     * 防守方法
     */
    public abstract void defense();
}

