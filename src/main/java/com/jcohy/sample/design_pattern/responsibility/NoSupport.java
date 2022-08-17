package com.jcohy.sample.design_pattern.responsibility;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:14:29
 * @since 2022.04.0
 */
// tag::code[]
public class NoSupport extends Support {

    // 解决问题具体类(永远不处理)
    public NoSupport(String name) {
        super(name);
    }

    // 解决的方法，自己不做处理
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }

}
// end::code[]
