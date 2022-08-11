package com.jcohy.sample.design_pattern.prototype.simple;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:10:51
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    private Prototype prototype;

    public void operation(Prototype prototype) {
        Prototype clone = (Prototype)prototype.clone();
    }
}
// end::code[]
