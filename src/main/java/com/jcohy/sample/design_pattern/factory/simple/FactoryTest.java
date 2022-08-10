package com.jcohy.sample.design_pattern.factory.simple;

import com.jcohy.sample.design_pattern.factory.Sender;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/9:18:20
 * @since 2022.04.0
 */
// tag::code[]
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produce("sms");
        sender.Send();
    }
}
// end::code[]
