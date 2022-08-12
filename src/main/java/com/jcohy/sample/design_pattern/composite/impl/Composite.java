package com.jcohy.sample.design_pattern.composite.impl;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:10:25
 * @since 2022.04.0
 */
// tag::code[]
public class Composite implements Component {

    private final Vector<Component> elements = new Vector<>();

    @Override
    public void sampleOperation() {
        Enumeration<Component> enumeration = components();
        while (enumeration.hasMoreElements()) {
            enumeration.nextElement().sampleOperation();
        }
    }

    @Override
    public Composite getComposite() {
        return this;
    }

    @Override
    public void add(Component component) {
        elements.addElement(component);
    }

    @Override
    public void remove(Component component) {
        elements.removeElement(component);
    }

    @Override
    public Enumeration<Component> components() {
        return elements.elements();
    }
}
// end::code[]
