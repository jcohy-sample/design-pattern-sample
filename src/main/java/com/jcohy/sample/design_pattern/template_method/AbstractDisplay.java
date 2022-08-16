package com.jcohy.sample.design_pattern.template_method;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/15:17:46
 * @since 2022.04.0
 */
// tag::code[]
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void close();

    public abstract void print();

    public void display() {
        // 由子类实现
        open();
        for (int i = 0; i < 5; i++) {
            // 由子类实现
            print();
        }
        // 由子类实现
        close();
    }
}
// end::code[]
