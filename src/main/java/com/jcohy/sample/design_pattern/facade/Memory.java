package com.jcohy.sample.design_pattern.facade;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/13:18:21
 * @since 2022.04.0
 */
// tag::code[]
public class Memory {

    public void startup() {
        System.out.println("memory startup");
    }

    public void shutdown() {
        System.out.println("memory shutdown");
    }

}
// end::code[]
