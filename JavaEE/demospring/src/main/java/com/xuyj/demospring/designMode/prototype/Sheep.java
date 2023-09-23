package com.xuyj.demospring.designMode.prototype;

import lombok.Data;

@Data
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;
    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
