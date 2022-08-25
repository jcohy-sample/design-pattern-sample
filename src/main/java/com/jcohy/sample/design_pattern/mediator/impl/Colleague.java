package com.jcohy.sample.design_pattern.mediator.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/25:10:51
 * @since 2022.04.0
 */
// tag::code[]
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void action();

    public void change() {
        mediator.colleagueChanged(this);
    }
}
// end::code[]
