package com.jcohy.sample.design_pattern.flyweight.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:17:41
 * @since 2022.04.0
 */
// tag::code[]
public abstract class Flyweight {
    /**
     * 一个示意性方法，参数 state 是外蕴状态
     */
    public abstract void operation(String state);
}
// end::code[]
