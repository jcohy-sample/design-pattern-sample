package com.jcohy.sample.design_pattern.adapter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:17:21
 * @since 2022.04.0
 */
// tag::code[]
public interface Target {

    /**
     * 这是源类有的方法
     */
    void operation1();

    /**
     * 这是源类没有的方法
     */
    void operation2();

}
// end::code[]
