package com.jcohy.sample.design_pattern.composite.impl;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:10:24
 * @since 2022.04.0
 */
// tag::code[]
public interface Component {

    /**
     * 业务方法
     */
    void sampleOperation();

    /**
     * 返回自己的实例
     */
    Composite getComposite();

    /**
     * 增加一个子构件对象
     */
    void add(Component component);

    /**
     * 删除一个子构件对象
     */
    void remove(Component component);

    /**
     * 返回 Enumeration 对象
     */
    Enumeration components();
}
// end::code[]
