package com.xuyj.demospring.designMode.visitor;

/**
 * 程序员
 */
public class Programmer  implements CorporateSlave {
    private String name;

    public Programmer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CorporateSlaveVisitor visitor) {
        visitor.visit(this);
    }
}
