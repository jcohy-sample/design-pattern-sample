package com.jcohy.sample.design_pattern.singleton;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:16:43
 * @since 2022.04.0
 */
// tag::code[]
public class NestSingleton {

    private static class SingletonHolder {

        public static NestSingleton instance = new NestSingleton();
    }

    private NestSingleton() {
    }

    public static NestSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
// end::code[]
