package com.xuyj.demospring.designMode.abstractFactory;

import com.xuyj.demospring.designMode.abstractFactory.pojo.BaseSettingParam;
import com.xuyj.demospring.designMode.abstractFactory.pojo.CarSettingParam;

public class CarSettingParamFactory extends BaseCreateor {
    @Override
    public BaseSettingParam CreateSettinParamFactory() {
        return new CarSettingParam();
    }
}
