package com.jcohy.sample.design_pattern.builder;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/11:10:17
 * @since 2022.04.0
 */
// tag::code[]
public interface Builder {

    /**
     * 用建造模式建立 "文件" 的程序。文件构造如下: 1.含有一个标题 2.含有一些字符串 3.含有一些有项目符号的项目
     * Builer类规定了组成文件的方法。而Director类利用这些方法才能产生1个具体的文件
     * @param title
     */
    void makeTitle(String title);

    void makeString(String str);

    void makeItems(String[] items);

    Object getResult();

}
// end::code[]
