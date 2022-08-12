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
public class FullBorder extends Border {

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {

        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {// 行数==内容行数加上下装饰字符
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine("-", display.getColumns()) + "+";
        }
        else if (row == display.getRows() + 1) {
            return "+" + makeLine("-", display.getColumns()) + "+";
        }
        else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(String string, int columns) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < columns; i++) {
            sb.append(string);
        }
        return sb.toString();
    }

}
// end::code[]
