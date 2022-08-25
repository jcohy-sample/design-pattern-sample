package com.jcohy.sample.design_pattern.mediator.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/25:11:38
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        mediator.createConcreteMediator();
        Colleague1 colleague1 = new Colleague1(mediator);
        Colleague2 colleague2 = new Colleague2(mediator);
        mediator.colleagueChanged(colleague1);
    }
}
// end::code[]
