package com.jcohy.sample.design_pattern.responsibility;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:14:30
 * @since 2022.04.0
 */
// tag::code[]
public class SpecialSupport extends Support {

    // 解决问题具体类(解决特殊号码的问题)
    private int number;// 只能解决此号码的问题

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() == number) {
            return true;
        }
        return false;
    }

}
// end::code[]
