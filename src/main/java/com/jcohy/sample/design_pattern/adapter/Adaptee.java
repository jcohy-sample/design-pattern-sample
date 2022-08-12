package com.jcohy.sample.design_pattern.adapter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:17:22
 * @since 2022.04.0
 */
// tag::code[]
public class Adaptee {

    public void operation1() {
        System.out.println("已存在的、具有特殊功能、但不符合我们既有的标准接口的类!");
    }

}
// end::code[]
