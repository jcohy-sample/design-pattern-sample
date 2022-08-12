package com.jcohy.sample.design_pattern.decorator.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:14:54
 * @since 2022.04.0
 */
// tag::code[]
public class Decorator implements Component {

    private Component component;

    public Decorator() {
    }

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
// end::code[]
