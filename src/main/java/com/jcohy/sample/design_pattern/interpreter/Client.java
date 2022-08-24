package com.jcohy.sample.design_pattern.interpreter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:18:21
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {
        Context context = new Context();

        Variable x = new Variable("x");
        Variable y = new Variable("y");
        Constant constant = new Constant(true);
        context.assign(x,false);
        context.assign(y,true);

        Expression expression = new Or(new And(constant,x),new And(y,new Not(x)));
        // x = false
        System.out.println("x = " + x.interpret(context));
        // y = true
        System.out.println("y = " + y.interpret(context));
        // ((true AND x) OR (y AND ( Not x)))=true
        System.out.println(expression + "=" + expression.interpret(context));
    }
}
// end::code[]
