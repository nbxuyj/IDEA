package com.xuyj.demospring.designMode.interpreterV2;

/**
 * Expression
 * @author binghe
 *
 */
public class SimpleExpression extends Expression {
    public void interpret(Context ctx) {
        System.out.println("这是普通解析器!");
    }
}