package com.xuyj.demospring.designMode.adapter._球员.imp;

import com.xuyj.demospring.designMode.adapter._球员.Player;

/**
 * 前锋
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("前锋「0」进攻  " + name);
    }

    @Override
    public void defense() {
        System.out.println("前锋「0」防守  " + name);
    }
}