package com.jcohy.sample.design_pattern.iterator;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:12:13
 * @since 2022.04.0
 */
// tag::code[]
public interface Iterator {

    boolean hashNext();

    Object next();
}
// end::code[]
