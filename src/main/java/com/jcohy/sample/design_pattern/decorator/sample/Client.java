package com.jcohy.sample.design_pattern.decorator.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:15:11
 * @since 2022.04.0
 */
// tag::code[]
public class Client {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello World");
        Display d2 = new SideBorder(d1, ' ');
        Display d3 = new FullBorder(d2);
        System.out.println("d1:");
        d1.show();
        System.out.println("d2:");
        d2.show();
        System.out.println("d3:");
        d3.show();
        Display d4 = new SideBorder(
                new FullBorder(new FullBorder(new SideBorder(new FullBorder(new StringDisplay("您好！")), ' '))), '/');
        System.out.println("d4:");
        d4.show();

    }
}
// end::code[]
