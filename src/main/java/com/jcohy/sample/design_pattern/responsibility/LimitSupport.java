package com.jcohy.sample.design_pattern.responsibility;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:14:32
 * @since 2022.04.0
 */
// tag::code[]
public class LimitSupport extends Support {

    private final Integer limit;
    public LimitSupport(String name, Integer limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() <= limit) {
            return true;
        }
        return false;
    }
}
// end::code[]
