package com.jcohy.sample.design_pattern.singleton;

import java.util.HashMap;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:16:56
 * @since 2022.04.0
 */
// tag::code[]
public class RegSingleton {

    private static HashMap<String, RegSingleton> registry = new HashMap<>();

    static {
        RegSingleton singleton = new RegSingleton();
        // 将自己实例化
        registry.put(singleton.getClass().getName(),singleton);
    }

    // 默认构造方法
    protected RegSingleton() {

    }

    // 静态工厂方法，返回此类唯一的实例
    public static RegSingleton getInstance(String name) {
        if( name == null ) {
            name = "com.jcohy.sample.design_pattern.singleton.RegSingleton";
        }

        if (registry.get(name) == null) {
            try {
                registry.put(name, (RegSingleton) Class.forName(name).newInstance());
            } catch (Exception e) {
                System.out.println("Error happened");
            }
        }
        return registry.get(name);
    }

    /**
     * 一个示意性的商业方法
     */
    public String about() {
        return "Hello，I am RegSingleton";
    }
}
// end::code[]
