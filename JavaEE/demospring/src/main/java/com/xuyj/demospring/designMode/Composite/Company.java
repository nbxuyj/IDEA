package com.xuyj.demospring.designMode.Composite;

import lombok.Data;

@Data
public abstract class Company {
    public Company(String name) {
        this.name = name;
    }

    public Company() {
    }

    private String name;
    public abstract void add(Company company);

    public abstract void romove(Company company);

    public abstract void display(int depth);

}
