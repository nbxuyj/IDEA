package com.xuyj.demospring.designMode.factorymethod;


import com.xuyj.demospring.designMode.simplefatory.SimpleRouJiaMoFactroy;
import com.xuyj.demospring.designMode.simplefatory.pojo.LaRouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.RouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.SuanRouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.TianRouJiaMo;

/**
 * 工厂方法
 */
public abstract class RoujiaMoStoreV2 {

    protected   String btype;
    /**
     * 让子类去创建对象
     * @param type
     * @return
     */
    public  abstract RouJiaMo createRouJiaMo(String type);


    public RouJiaMo sellRouJiaMoV2() {
        // 调用子类的方法
        RouJiaMo rouJiaMo = createRouJiaMo(btype);
        rouJiaMo.prepare();
        rouJiaMo.fire();
        rouJiaMo.pack();
        return rouJiaMo;
    }

}