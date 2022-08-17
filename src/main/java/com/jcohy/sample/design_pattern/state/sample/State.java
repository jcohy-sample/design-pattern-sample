package com.jcohy.sample.design_pattern.state.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:18:19
 * @since 2022.04.0
 */
// tag::code[]
public interface State {

    // 设定时间
    void doClock(Context context, int hour);

    // 使用金库
    void doUse(Context context);

    // 警铃
    void doAlarm(Context context);

    // 普通电话
    void doPhone(Context context);

}
// end::code[]
