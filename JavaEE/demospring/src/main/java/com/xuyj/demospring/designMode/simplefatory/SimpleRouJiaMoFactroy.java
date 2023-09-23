package com.xuyj.demospring.designMode.simplefatory;

import com.xuyj.demospring.designMode.simplefatory.pojo.LaRouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.RouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.SuanRouJiaMo;
import com.xuyj.demospring.designMode.simplefatory.pojo.TianRouJiaMo;

public class SimpleRouJiaMoFactroy
{
    public RouJiaMo createRouJiaMo(String type)
    {
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

