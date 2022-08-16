package com.jcohy.sample.design_pattern.observer.impl;

import java.util.Vector;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/16:12:19
 * @since 2022.04.0
 */
// tag::code[]
public class ConcreteSubject implements Subject {

    private Vector<Observer> observers = new Vector<>();

    @Override
    public void attach(Observer observer) {
        observers.addElement(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.removeElement(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }
}
// end::code[]
