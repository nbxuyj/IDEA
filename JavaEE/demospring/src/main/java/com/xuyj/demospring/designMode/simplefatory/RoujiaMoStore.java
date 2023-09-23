package com.xuyj.demospring.designMode.simplefatory;


import com.xuyj.demospring.designMode.simplefatory.pojo.LaRouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.RouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.SuanRouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.TianRouJiaMo;

/**
 * 原始方法。 简单工厂可以替换。
 */
public class RoujiaMoStore {
    /**
     * 根据传入类型卖不同的肉夹馍
     *
     * @param type
     * @return
     */
    public RouJiaMo sellRouJiaMo(String type) {
        RouJiaMo rouJiaMo = null;

        if (type.equals("Suan")) {
            rouJiaMo = new SuanRouJiaMo();

        } else if (type.equals("Tian")) {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La")) {
            rouJiaMo = new LaRouJiaMo();
        }

        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }


    /**
     * 简单工厂类
     */
    private SimpleRouJiaMoFactroy factory;

    public RoujiaMoStore(SimpleRouJiaMoFactroy factor) {
        this.factory = factor;
    }

    public RouJiaMo sellRouJiaMoV2(String type) {
        RouJiaMo rouJiaMo = factory.createRouJiaMo(type);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }

}