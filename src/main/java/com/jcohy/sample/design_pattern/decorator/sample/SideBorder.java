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
public class SideBorder extends Border {

    private char borderChar;// 装饰的字符

    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {// 字数要再加上内容，两边的装饰字符
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        // TODO Auto-generated method stub
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {// 指定行的两边加上装饰字符
        // TODO Auto-generated method stub
        return borderChar + display.getRowText(row) + borderChar;
    }

}
