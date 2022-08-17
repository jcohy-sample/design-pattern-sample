package com.jcohy.sample.design_pattern.state.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:18:20
 * @since 2022.04.0
 */
// tag::code[]
public class DayState implements State {

    // 白天状态的类
    private static DayState singleton = new DayState();

    private DayState() {
    }

    public static State getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        // 使用金库
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("一般通话(白天)");
    }

    @Override
    public String toString() {
        return "[白天]";
    }

}
// end::code[]
