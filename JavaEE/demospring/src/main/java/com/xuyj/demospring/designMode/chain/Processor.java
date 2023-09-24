package com.xuyj.demospring.designMode.chain;

import com.xuyj.demospring.designMode.chain.pojo.Product;

public interface Processor {
    boolean process(Product request, ProcessorChain chain);
}