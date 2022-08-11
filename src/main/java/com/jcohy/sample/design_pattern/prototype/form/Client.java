package com.jcohy.sample.design_pattern.prototype.form;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:15:37
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    private PrototypeManager mgr;
    private Prototype prototype;

    public void registerPrototype() {
        prototype = new ConcretePrototype();
        Prototype copy = (Prototype) prototype.clone();
        mgr.add(copy);
    }
}
// end::code[]
