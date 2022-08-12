package com.jcohy.sample.design_pattern.proxy;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:16:19
 * @since 2022.04.0
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("执行请求。。。");
    }
}
