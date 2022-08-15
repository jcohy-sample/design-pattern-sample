package com.jcohy.sample.design_pattern.template_method;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/15:17:51
 * @since 2022.04.0
 */
public class StringDisplay extends AbstractDisplay {

    private String str;

    private int width;

    public StringDisplay(String str) {
        this.str = str;
        this.width = str.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void close() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

}
