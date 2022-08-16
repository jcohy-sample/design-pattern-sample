package com.jcohy.sample.design_pattern.observer.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/16:17:32
 * @since 2022.04.0
 */
// tag::code[]
public class GraphObserver implements Observer {
    // 实现Observer接口,以 "" 来表示观察到的数值
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("GraphObserver:");
        int count = numberGenerator.getNum();
        for (int i = 0; i < count; i++) {
            System.out.print("");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
// end::code[]
