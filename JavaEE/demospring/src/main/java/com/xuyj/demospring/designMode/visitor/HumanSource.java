package com.xuyj.demospring.designMode.visitor;

public class HumanSource implements CorporateSlave {

    private String name;

    public HumanSource(String name) {
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