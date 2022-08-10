package com.jcohy.sample.design_pattern.factory;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/9:18:13
 * @since 2022.04.0
 */
// tag::code[]
public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mail sender!");
    }
}
// end::code[]
