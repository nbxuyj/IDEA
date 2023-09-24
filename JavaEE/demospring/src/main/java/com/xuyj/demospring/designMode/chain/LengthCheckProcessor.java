package com.xuyj.demospring.designMode.chain;

import com.xuyj.demospring.designMode.chain.pojo.Product;

public class LengthCheckProcessor implements Processor{
    @Override
    public boolean process(Product request, ProcessorChain chain) {
        Integer length = request.getLength();
        if (length < 100 && length > 50) {
            System.out.println("产品长度检验通过");
            return chain.process(request, chain);
        }
        // 产品长度未检验通过
        System.out.println("产品长度未检验通过");
        return false;
    }

}
