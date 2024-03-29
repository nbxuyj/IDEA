package com.xuyj.demospring.designMode.chain;

import com.xuyj.demospring.designMode.chain.pojo.Product;

public class WidthCheckProcessor implements Processor{
    @Override
    public boolean process(Product request, ProcessorChain chain) {
        Integer width = request.getWidth();
        if (width < 100 && width > 50) {
            System.out.println("产品宽度检验通过");
            return chain.process(request, chain);
        }
        // 产品宽度未检验通过
        System.out.println("产品宽度未检验通过");
        return false;
    }
}