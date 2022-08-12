package com.jcohy.sample.design_pattern.composite.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:11:08
 * @since 2022.04.0
 */
public class Client {

    public static void main(String[] args) {
        Composite composite = new Composite();
        composite.add(new Leaf());
        composite.add(new Composite());
        composite.sampleOperation();
//        new Leaf().add(composite);
    }
}
