package com.xuyj.demospring.designMode.abstractFactory.pojo;

/**
 * 车票的系统参数。
 */
public class CarSettingParam extends BaseSettingParam {
    public CarSettingParam() {
        Name="车票参数";
        AllowPayModes="支付宝";
        MaxNum=10;
    }
}
