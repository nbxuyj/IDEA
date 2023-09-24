package com.xuyj.demospring.designMode.observer.impl;

import com.xuyj.demospring.designMode.observer.ISubstriber;
import com.xuyj.demospring.designMode.observer.Publisher;
import lombok.var;

public class Employee implements ISubstriber {
    String Name;

    public Employee(String name) {
        Name = name;
    }

    public Employee() {
    }

    @Override
    public void Recivier(Publisher pub) {
        var msg=String.format("员工【%s】，收到消息【%s】",Name,pub.Message);
        System.out.println(String.format("员工【%s】，收到消息【%s】",Name,pub.Message));
        System.out.println(String.format("员工【%s】鼓掌",Name));
    }
}
