package com.jcohy.sample.design_pattern.adapter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:17:23
 * @since 2022.04.0
 */
// tag::code[]
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    /**
     * 源类有方法 operation1 ，直接委派
     */
    @Override
    public void operation1() {
        adaptee.operation1();
    }

    /**
     * 源类没有 operation2，因此适配器需要补充此方法
     */
    @Override
    public void operation2() {
        // Write your code here
        System.out.println("普通类 具有 普通功能...");
    }
}
// end::code[]
