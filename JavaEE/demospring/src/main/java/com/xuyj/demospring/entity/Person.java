package com.xuyj.demospring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor //有参构造
public class Person {
    public Person(String name) {
        Name = name;
    }

    /**
     * protected 该类及子类可以访问。
     */
   protected String Name;

    /**
     * privete  该类中使用。
     */
   private  String Note;

    /**
     * public 公共
     */
   public String PubName;
}
