package com.jcohy.sample.design_pattern.observer.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/16:12:23
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        // 输出：I am notified!
        subject.notifyObservers();
    }
}
// end::code[]
