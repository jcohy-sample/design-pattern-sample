package com.jcohy.sample.design_pattern.state.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:18:15
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState());
        // 输出：Hello World
        context.operation();
    }
}
// end::code[]
