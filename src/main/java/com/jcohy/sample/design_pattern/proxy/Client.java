package com.jcohy.sample.design_pattern.proxy;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:16:20
 * @since 2022.04.0
 */
// tag::code[]
public class Client {
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
// end::code[]
