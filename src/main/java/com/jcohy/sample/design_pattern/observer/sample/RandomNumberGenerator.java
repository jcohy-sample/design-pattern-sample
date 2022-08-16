package com.jcohy.sample.design_pattern.observer.sample;

import java.util.Random;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/16:17:31
 * @since 2022.04.0
 */
// tag::code[]
public class RandomNumberGenerator extends NumberGenerator {
    // 产生随机数
    Random rd = new Random();

    private int number = 0;

    @Override
    public int getNum() {
        return number;
    }

    @Override
    public void excuteNum() {
        for (int i = 0; i < 10; i++) {
            number = rd.nextInt(50);
            // TODO Auto-generated method stub
            notifyObservers();
        }
    }
}
// end::code[]
