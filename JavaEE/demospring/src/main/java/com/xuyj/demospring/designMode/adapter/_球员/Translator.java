package com.xuyj.demospring.designMode.adapter._球员;

import com.xuyj.demospring.designMode.adapter._球员.imp.ForeignCenter;

/**
 * 翻译者
 */
public class Translator extends Player {
    // 申明并实例化一个内部"外籍中锋"对象，表明翻译者与外籍球员有关联
    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    /**
     * 翻译者将"attack"翻译为"进攻"告诉外籍中锋
     */
    @Override
    public void attack() {
        foreignCenter.attackForeign();
    }

    /**
     * 翻译者将"defense"翻译为"防守"告诉外籍中锋
     */
    @Override
    public void defense() {
        foreignCenter.defenseForeign();
    }
}

