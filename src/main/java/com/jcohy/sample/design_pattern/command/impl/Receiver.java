package com.jcohy.sample.design_pattern.command.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:17:03
 * @since 2022.04.0
 */
// tag::code[]
public class Receiver {
    public Receiver() {
    }

    // 行动当法
    public void action() {
        System.out.println("action has been taken!");
    }
}
// end::code[]
