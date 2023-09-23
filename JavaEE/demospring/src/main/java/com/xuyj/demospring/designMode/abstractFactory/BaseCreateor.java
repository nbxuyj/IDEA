package com.xuyj.demospring.designMode.abstractFactory;

import com.xuyj.demospring.designMode.abstractFactory.pojo.BaseSettingParam;

/**
 * 抽象工厂类
 */
public  abstract class BaseCreateor {
    /**
     * 工厂方法
     * @return
     */
    public abstract BaseSettingParam CreateSettinParamFactory();
}
