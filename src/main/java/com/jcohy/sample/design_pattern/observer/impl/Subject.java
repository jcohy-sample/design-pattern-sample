package com.jcohy.sample.design_pattern.observer.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/16:12:17
 * @since 2022.04.0
 */
// tag::code[]
public interface Subject {
    /**
     * 新增一个观察者
     */
    void attach(Observer observer);
    /**
     * 删除一个观察者
     */
    void detach(Observer observer);
    /**
     * 通知所有的观察者对象
     */
    void notifyObservers();
}
// end::code[]
