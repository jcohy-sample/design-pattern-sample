package com.jcohy.sample.design_pattern.factory.abs;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:10:39
 * @since 2022.04.0
 */
// tag::code[]
public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);
}
// end::code[]
