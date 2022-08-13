package com.jcohy.sample.design_pattern.bridge;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/13:18:40
 * @since 2022.04.0
 */
// tag::code[]
public class MysqlDriver implements Driver {

    @Override
    public void connection() {

        System.out.println("implement mysql connection");
    }

}
// end::code[]
