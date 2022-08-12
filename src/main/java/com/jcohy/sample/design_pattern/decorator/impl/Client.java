package com.jcohy.sample.design_pattern.decorator.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:14:58
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    /**
     * 装饰者的调用呈链状结构
     */
    public static void main(String[] args) {
        new Decorator(
                new Decorator(
                        new Decorator(
                                new ConcreteComponent()
                        )
                )
        );
    }
}
// end::code[]
