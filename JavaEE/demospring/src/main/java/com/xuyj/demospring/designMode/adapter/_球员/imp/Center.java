package com.xuyj.demospring.designMode.adapter._球员.imp;

import com.xuyj.demospring.designMode.adapter._球员.Player;

/**
 * 中锋
 */
public class Center extends Player {

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("中锋「0」进攻  " + name);
    }

    @Override
    public void defense() {
        System.out.println("中锋「0」防守  " + name);
    }
}