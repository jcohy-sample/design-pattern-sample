package com.jcohy.sample.design_pattern.template_method;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/15:17:52
 * @since 2022.04.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractDisplay a = new CharDisplay('a');
        AbstractDisplay b = new StringDisplay("Hello world");
        a.display();
        b.display();
    }
}
