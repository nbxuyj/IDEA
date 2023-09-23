package com.xuyj.demospring.designMode.decorator._具体装饰;

import com.xuyj.demospring.designMode.decorator.TheGreatestSage;
import com.xuyj.demospring.designMode.decorator._抽象装饰.Change;

public class Bird extends Change {
    public Bird(TheGreatestSage sage) {
        super(sage);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Change bird move");
    }
}