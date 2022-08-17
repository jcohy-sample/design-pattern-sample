package com.jcohy.sample.design_pattern.state.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:18:21
 * @since 2022.04.0
 */
// tag::code[]
public class NightState implements State {

    // 晚上状态的类
    private static NightState singleton = new NightState();

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.callSecurityCenter("异常，晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("警铃(晚上)");

    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚间的通话录音");
    }

    @Override
    public String toString() {
        return "[晚间]";
    }
}
// end::code[]
