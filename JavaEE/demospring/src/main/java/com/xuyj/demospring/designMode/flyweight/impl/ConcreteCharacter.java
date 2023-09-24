package com.xuyj.demospring.designMode.flyweight.impl;

import com.xuyj.demospring.designMode.flyweight.ICharacter;
import com.xuyj.demospring.designMode.flyweight.pojo.CharacterStyle;


public class ConcreteCharacter implements ICharacter {
    private final char character;

    public ConcreteCharacter(char character) {
        this.character = character;
    }

    @Override
    public void display(CharacterStyle style) {
        System.out.println("Character: " + character + ", Style: " + style);
    }
}