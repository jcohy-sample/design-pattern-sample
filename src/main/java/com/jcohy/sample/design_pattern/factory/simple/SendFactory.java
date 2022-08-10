package com.jcohy.sample.design_pattern.factory.simple;

import com.jcohy.sample.design_pattern.factory.MailSender;
import com.jcohy.sample.design_pattern.factory.Sender;
import com.jcohy.sample.design_pattern.factory.SmsSender;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/9:18:15
 * @since 2022.04.0
 */
// tag::code[]
public class SendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        }
        else if ("sms".equals(type)) {
            return new SmsSender();
        }
        else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
// end::code[]
