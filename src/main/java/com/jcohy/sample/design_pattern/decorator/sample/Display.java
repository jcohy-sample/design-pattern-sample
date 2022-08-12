package com.jcohy.sample.design_pattern.decorator.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/12:15:10
 * @since 2022.04.0
 */
// tag::code[]
public abstract class Display {

    public abstract int getColumns();// 取得横向的字数

    public abstract int getRows();// 取得纵向的行数

    public abstract String getRowText(int row);// 取得第Row个字符串

    public final void show() {// 打印所有内容
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }

}
// end::code[]
