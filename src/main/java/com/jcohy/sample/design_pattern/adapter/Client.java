package com.jcohy.sample.design_pattern.adapter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:17:26
 * @since 2022.04.0
 */
// tag::code[]
public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.operation2();
        // 输出： 普通类 具有 普通功能...
    }
}
// end::code[]
