package com.xuyj.demospring.designMode.adapter._球员.imp;

/**
 * 外籍中锋
 */
public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attackForeign() {
        System.out.println("外籍中锋「0」进攻  " + name);
    }

    public void defenseForeign() {
        System.out.println("外籍中锋「0」防守  " + name);
    }
}