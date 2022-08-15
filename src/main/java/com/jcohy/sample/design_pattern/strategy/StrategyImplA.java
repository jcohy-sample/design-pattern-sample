package com.jcohy.sample.design_pattern.strategy;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/15:16:48
 * @since 2022.04.0
 */
// tag::code[]
public class StrategyImplA implements Strategy {
    @Override
    public void algorithmInterface() {
        System.out.println("这是A的算法实现");
    }
}
// end::code[]
