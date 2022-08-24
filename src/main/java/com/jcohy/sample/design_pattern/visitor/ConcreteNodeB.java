package com.jcohy.sample.design_pattern.visitor;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:11:55
 * @since 2022.04.0
 */
// tag::code[]
public class ConcreteNodeB implements Node {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB(){
        System.out.println("ConcreteNodeB 特有方法！");
        return "ConcreteNodeB is Visited!";
    }
}
// end::code[]
