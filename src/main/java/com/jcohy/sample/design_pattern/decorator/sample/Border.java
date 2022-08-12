package com.jcohy.sample.design_pattern.decorator.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:15:11
 * @since 2022.04.0
 */
public abstract class Border extends Display {

    protected Display display;// 指装饰外框里面的内容

    public Border(Display display) {
        this.display = display;
    }

}
