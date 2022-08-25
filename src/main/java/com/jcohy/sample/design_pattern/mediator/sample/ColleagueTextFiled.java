package com.jcohy.sample.design_pattern.mediator.sample;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/25:11:51
 * @since 2022.04.0
 */
// tag::code[]
public class ColleagueTextFiled extends TextField implements TextListener, Colleague {

    private Mediator mediator;

    public ColleagueTextFiled(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.LIGHT_GRAY);
    }

    @Override
    public void textValueChanged(TextEvent arg0) {
        // 若字符串有变化，就通知Mediator
        mediator.colleagueChanged(this);
    }

}
// end::code[]
