package com.xuyj.demospring.designMode.abstractFactory.pojo;

/**
 * 船票的系统参数。
 */
public class ShipSetttingParam extends BaseSettingParam {
    public ShipSetttingParam() {
        Name="船票参数";
        AllowPayModes="微信";
        MaxNum=20;
    }
}
