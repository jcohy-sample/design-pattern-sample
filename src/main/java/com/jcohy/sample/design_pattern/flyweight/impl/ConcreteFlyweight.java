package com.jcohy.sample.design_pattern.flyweight.impl;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:17:42
 * @since 2022.04.0
 */
// tag::code[]
public class ConcreteFlyweight extends Flyweight {

    private Character intrinsicState = null;

    public ConcreteFlyweight(Character intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为。但是并不改变对象的内蕴状态
     * @param state 外蕴状态
     */
    @Override
    public void operation(String state) {
        System.out.println("\nIntrinsic State = " + intrinsicState + ", Extrinsic State = " + state);
    }
}
// end::code[]
