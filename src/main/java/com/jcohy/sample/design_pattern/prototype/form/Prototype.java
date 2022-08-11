package com.jcohy.sample.design_pattern.prototype.form;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:10:50
 * @since 2022.04.0
 */
// tag::code[]
public interface Prototype extends Cloneable {

    Object clone();

}
// end::code[]
