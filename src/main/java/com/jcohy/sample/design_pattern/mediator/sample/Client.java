package com.jcohy.sample.design_pattern.mediator.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/25:11:53
 * @since 2022.04.0
 */
// tag::code[]
public class Client {
    /**
     * 要求输入姓名和密码的登录系统，系统分为访客登录(Guest)或者用户登录(Login) 如果是访客登录，用户名和密码设为不可用状态，无法输入字符串
     * 如果选择用户登录，用户名设为可使用。当用户名不填写时，密码设为不可使用。都填写了，OK键设为可使用。 OK键在访客时可以使用 Cancel永远设为可使用
     */
    public static void main(String[] args) {
        new LoginFrame("Mediator sample");
    }
}
// end::code[]
