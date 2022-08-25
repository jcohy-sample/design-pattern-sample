package com.jcohy.sample.design_pattern.mediator.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/25:11:03
 * @since 2022.04.0
 */
// tag::code[]
public class ConcreteMediator extends Mediator {

    private Colleague1 colleague1;

    private Colleague2 colleague2;

    /**
     * 事件方法的具体实现
     */
    @Override
    public void colleagueChanged(Colleague colleague) {
        colleague1.action();
        colleague2.action();
    }

    /**
     * 工厂方法，创建同事对象
     */
    public void createConcreteMediator() {
        colleague1 = new Colleague1(this);
        colleague2 = new Colleague2(this);
    }

    public Colleague1 getColleague1() {
        return colleague1;
    }

    public Colleague2 getColleague2() {
        return colleague2;
    }
}
// end::code[]
