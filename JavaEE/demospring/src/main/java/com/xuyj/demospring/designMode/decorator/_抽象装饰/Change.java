package com.xuyj.demospring.designMode.decorator._抽象装饰;

import com.xuyj.demospring.designMode.decorator.TheGreatestSage;

/**
 * 抽象装饰角色“七十二变”
 */
public class Change implements TheGreatestSage {
    private TheGreatestSage sage;

    public Change(TheGreatestSage sage) {
        this.sage = sage;
    }
    @Override
    public void move() {
        this.sage.move();
    }
}