package com.jcohy.sample.design_pattern.singleton;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:17:16
 * @since 2022.04.0
 */
// tag::code[]
public class RegSingletonChild extends RegSingleton {

    public RegSingletonChild() {}

    // 静态工厂方法
    public static RegSingletonChild getInstance() {
        return (RegSingletonChild) RegSingleton.getInstance(
                "com.jcohy.sample.design_pattern.singleton.RegSingletonChild");
    }

    // 一个示意性的商业方法
    public String about() {
        return "Hello, I am RegSingletonChild.";
    }
}
// end::code[]
