package com.jcohy.sample.design_pattern.builder;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:10:18
 * @since 2022.04.0
 */
// tag::code[]
public class TextBuilder implements Builder {

    // 是 Builder 的子类，以一般文本格式建立文件，以 String 返回字符串。
    private final StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("====================\n");
        buffer.append("[").append(title).append("]\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        // 带*的字符串
        buffer.append("").append(str).append("\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        // 带.的项目
        for (String item : items) {
            buffer.append(".").append(item).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public Object getResult() {
        buffer.append("====================\n");
        return buffer.toString();
    }
}
// end::code[]
