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
 * @version 2022.04.0 2022/8/12:10:43
 * @since 2022.04.0
 */
// tag::code[]
public class Leaf implements Component {

    @Override
    public void sampleOperation() {
        System.out.println("此为树叶节点");
    }

    @Override
    public Composite getComposite() {
        return null;
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Enumeration components() {
        return null;
    }
}
// end::code[]
