package com.jcohy.sample.design_pattern.visitor;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:12:06
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    private static ObjectStructure objectStructure;

    private static Visitor visitor;

    public static void main(String[] args) {
        objectStructure = new ObjectStructure();
        objectStructure.add(new ConcreteNodeA());
        objectStructure.add(new ConcreteNodeB());
        visitor = new VisitorA();
        // 输出：
        // ConcreteNodeA 特有方法！
        // ConcreteNodeA is Visited!
        // ConcreteNodeB 特有方法！
        // ConcreteNodeB is Visited!

        objectStructure.action(visitor);
    }
}
// end::code[]
