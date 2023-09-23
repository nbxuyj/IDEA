package com.xuyj.demospring.designMode.abstractFactory;

import com.xuyj.demospring.designMode.abstractFactory.pojo.BaseSettingParam;
import com.xuyj.demospring.designMode.abstractFactory.pojo.ShipSetttingParam;

public class ShipSettingFactory extends BaseCreateor{
    @Override
    public BaseSettingParam CreateSettinParamFactory() {
        return new ShipSetttingParam();
    }
}
