package com.jcohy.sample.design_pattern.memento;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:17:40
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {

        // 创建原始类
        Original origi = new Original("egg");

        // 创建备忘录
        Storage storage = new Storage(origi.createMemento());

        // 修改原始类的状态
        System.out.println("初始化状态为: " + origi.getValue());
        origi.setValue("niu");
        System.out.println("修改后的状态为: " + origi.getValue());

        // 回复原始类的状态
        origi.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为: " + origi.getValue());
    }

}
// end::code[]
