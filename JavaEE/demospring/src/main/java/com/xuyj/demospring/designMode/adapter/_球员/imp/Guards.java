package com.xuyj.demospring.designMode.adapter._球员.imp;

import com.xuyj.demospring.designMode.adapter._球员.Player;

public class Guards extends Player {
    public Guards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("后卫「0」进攻  " + name);
    }

    @Override
    public void defense() {
        System.out.println("后卫「0」防守  " + name);
    }
}
