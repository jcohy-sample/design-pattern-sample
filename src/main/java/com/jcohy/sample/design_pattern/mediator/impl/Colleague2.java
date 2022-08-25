package com.jcohy.sample.design_pattern.mediator.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/25:10:59
 * @since 2022.04.0
 */
// tag::code[]
public class Colleague2 extends Colleague {

    public Colleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void action() {
        System.out.println("This is an action from Colleague 2");
    }
}
// end::code[]
