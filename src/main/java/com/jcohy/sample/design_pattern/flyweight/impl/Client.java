package com.jcohy.sample.design_pattern.flyweight.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:17:54
 * @since 2022.04.0
 */
// tag::code[]
public class Client {
    public static void main(String[] args) {
        // 创建享元工厂
        FlyweightFactory factory = new FlyweightFactory();

        // 向享元工厂对象请求一个内蕴状态为 a 的享元对象
        Flyweight flyweight = factory.factory('a');
        // 以参量方式传入一个外蕴状态
        flyweight.operation("First Call");

        // 向享元工厂对象请求一个内蕴状态为 b 的享元对象
        flyweight = factory.factory('b');
        // 以参量方式传入一个外蕴状态
        flyweight.operation("Second Call");

        // 向享元工厂对象请求一个内蕴状态为 a 的享元对象
        flyweight = factory.factory('a');
        // 以参量方式传入一个外蕴状态
        flyweight.operation("Third Call");

        // 向享元工厂对象请求一个内蕴状态为 a 的享元对象
        flyweight = factory.factory("aba");
        // 以参量方式传入一个外蕴状态
        flyweight.operation("Composite Call");

        factory.checkFlyweight();
    }
}
// end::code[]
