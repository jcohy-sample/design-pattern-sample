package com.jcohy.sample.design_pattern.observer.sample;

import java.util.Iterator;
import java.util.Vector;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/16:17:30
 * @since 2022.04.0
 */
// tag::code[]
public abstract class NumberGenerator {
    // 产生数值的抽象类，notifyObservers告诉所有的Observers内容改变。
    private Vector<Observer> observers = new Vector<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        Iterator<Observer> it = observers.iterator();
        while (it.hasNext()) {
            Observer o = (Observer) it.next();
            o.update(this);
        }
    }

    public abstract int getNum();

    public abstract void excuteNum();
}
// end::code[]
