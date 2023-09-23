package com.xuyj.demospring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Man extends Person implements ISpacker{
    public Man(String Name) {
        super(Name);
    }

    @Override
    public String Spacker() {
        return Name+"会说话！";
    }

    /**
     * 胡须数
     */
    private  int hxCount;


}
