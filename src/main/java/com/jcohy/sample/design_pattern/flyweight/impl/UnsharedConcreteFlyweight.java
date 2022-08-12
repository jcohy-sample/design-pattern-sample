package com.jcohy.sample.design_pattern.flyweight.impl;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:18:10
 * @since 2022.04.0
 */
// tag::code[]
public class UnsharedConcreteFlyweight extends Flyweight {

    /**
     * 复合享元对象是由单纯的享元对象通过复合而成，一次提供了 add 这样的聚集管理的方法。由于一个复合享元对象具有不同的聚集元素，这些聚集元素在复合
     * 享元对象被创建之后加入，这本身就意味着复合享元对象的状态是会改变的，因此复合享元对象是不能共享的。
     *
     * 复合享元对象也实现 Flyweight 接口。这个方法中的 state 代表复合享元对象的外蕴状态。一个复合享元对象的所有单纯享元对象元素的外蕴状态
     * 都是与复合享元对象的外蕴状态是相等的；而一个复合享元对象所含有的单纯享元对象的内蕴状态一般是不相等的。不然就没有使用价值了。
     */
    private HashMap<Character,Flyweight> files = new HashMap<>();

    private Flyweight flyweight;

    public UnsharedConcreteFlyweight() {
    }

    public void add(Character key, Flyweight flyweight) {
        files.put(key,flyweight);
    }
    @Override
    public void operation(String state) {
        for (Map.Entry<Character, Flyweight> item : files.entrySet()) {
            Flyweight flyweight = item.getValue();
            flyweight.operation(state);
        }
    }
}
// end::code[]
