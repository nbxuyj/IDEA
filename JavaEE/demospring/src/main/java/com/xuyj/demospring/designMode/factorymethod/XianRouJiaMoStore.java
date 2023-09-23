package com.xuyj.demospring.designMode.factorymethod;

import com.xuyj.demospring.designMode.simplefatory.pojo.LaRouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.RouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.SuanRouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.TianRouJiaMo;

public class XianRouJiaMoStore extends RoujiaMoStoreV2 {

    @Override
    public RouJiaMo createRouJiaMo(String type) {
        btype=type;
        RouJiaMo rouJiaMo = null;
        if (type.equals("Suan"))
        {
            rouJiaMo = new SuanRouJiaMo();

        } else if (type.equals("Tian"))
        {
            rouJiaMo = new TianRouJiaMo();
        } else if (type.equals("La"))
        {
            rouJiaMo = new LaRouJiaMo();
        }
        return rouJiaMo;

    }
}
