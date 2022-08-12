package com.jcohy.sample.design_pattern.flyweight.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:17:46
 * @since 2022.04.0
 */
// tag::code[]
public class FlyweightFactory {

    private HashMap<Character,Flyweight> files = new HashMap<>();

    private Flyweight inkFlyweight;

    public FlyweightFactory() {
    }

    /**
     * 复合享元工厂方法
     */
    public Flyweight factory(String state) {
       UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
       for(char c : state.toCharArray()) {
           unsharedConcreteFlyweight.add(c,this.factory(c));
       }
       return unsharedConcreteFlyweight;
    }

    /**
     * 单纯享元工厂方法
     */
    public Flyweight factory(Character state) {
        if(files.containsKey(state)) {
            return files.get(state);
        } else {
            Flyweight flyweight = new ConcreteFlyweight(state);
            files.put(state,flyweight);
            return flyweight;
        }
    }

    /**
     * 额外的辅助方法
     */
    public void checkFlyweight() {
        Flyweight flyweight;
        int i = 0;
        System.out.println("========= checkFlyweight ============");
        for (Map.Entry<Character, Flyweight> item : files.entrySet()) {
            System.out.println("Item " + (++i) + ":" + item.getKey());
        }
    }
}
// end::code[]
