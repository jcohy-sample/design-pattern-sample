package com.jcohy.sample.design_pattern.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:10:19
 * @since 2022.04.0
 */
// tag::code[]
public class HtmlBuilder implements Builder {

    /**
     * 将文本建立成HTML格式
     */
    private String fileName;

    private PrintWriter printWriter;

    @Override
    public void makeTitle(String title) {
        fileName = "title" + ".html";
        try {
            printWriter = new PrintWriter(new FileWriter(fileName));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        printWriter.write("<html><header><title>" + title + "</title></head><body>");
        printWriter.write("<h1>" + title + "</h1>");
    }

    @Override
    public void makeString(String str) {
        printWriter.write("<p>" + str + "</p>");
    }

    @Override
    public void makeItems(String[] items) {
        printWriter.write("<ul>");
        for (String item : items) {
            printWriter.write("<li>" + item + "</li>");
        }
        printWriter.write("</ul>");
    }

    @Override
    public Object getResult() {
        printWriter.write("</body></html>");
        printWriter.close();
        // 返回文件名
        return fileName;
    }

}
// end::code[]
