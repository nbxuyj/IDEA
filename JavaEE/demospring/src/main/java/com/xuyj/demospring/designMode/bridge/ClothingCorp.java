package com.xuyj.demospring.designMode.bridge;

public class ClothingCorp  extends  Corp{
    public ClothingCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司挣大钱啦...");
    }
}
