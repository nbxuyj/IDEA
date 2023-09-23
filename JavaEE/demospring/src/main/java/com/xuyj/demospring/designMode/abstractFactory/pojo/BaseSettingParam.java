package com.xuyj.demospring.designMode.abstractFactory.pojo;

import lombok.Data;
import lombok.ToString;

/**
 * 基类系统参数。
 */
@Data
public abstract class BaseSettingParam {
    public  String Name;
    /**
     * 允许支付方式。
     */
    public String AllowPayModes;
    /**
     * 允许售最大数
     */
    public Integer MaxNum;

    @Override
    public String toString() {
        return "BaseSettingParam{" +
                "Name='" + Name + '\'' +
                ", AllowPayModes='" + AllowPayModes + '\'' +
                ", MaxNum=" + MaxNum +
                '}';
    }
}
