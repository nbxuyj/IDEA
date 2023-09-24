package com.xuyj.demospring.designMode.interpreterV2;

/**
 * Expression
 * @author binghe
 *
 */
public class AdvanceExpression extends Expression {
   public void interpret(Context ctx) {
        System.out.println("这是高级解析器!");
    }
}
