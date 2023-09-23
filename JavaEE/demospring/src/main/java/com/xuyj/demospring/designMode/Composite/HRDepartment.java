package com.xuyj.demospring.designMode.Composite;

public class HRDepartment extends Company {


    public HRDepartment(){

    }

    public HRDepartment(String name){
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        System.out.println(new String(sb) + this.getName() ) ;
    }

    @Override
    public void romove(Company company) {

    }

}

