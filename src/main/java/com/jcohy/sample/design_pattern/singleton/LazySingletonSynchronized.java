package com.jcohy.sample.design_pattern.singleton;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:15:17
 * @since 2022.04.0
 */
// tag::code[]
public class LazySingletonSynchronized {

    private static LazySingletonSynchronized instance = null;

    private LazySingletonSynchronized() {
    }

    public static synchronized LazySingletonSynchronized getInstance() {
        if (null == instance) {
            instance = new LazySingletonSynchronized();
        }
        return instance;
    }
}
// end::code[]
