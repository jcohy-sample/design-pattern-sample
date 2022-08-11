package com.jcohy.sample.design_pattern.builder;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:10:18
 * @since 2022.04.0
 */
// tag::code[]
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 建立文件
    public Object construct() {
        builder.makeTitle("Hello World！");
        builder.makeString("EveryDay!");
        builder.makeItems(new String[] { "hello morning", "hello www" });
        builder.makeString("www.jcohy.com");
        builder.makeItems(new String[] { "welcome", "to", "my", "wensite" });
        return builder.getResult();
    }

}
// end::code[]
