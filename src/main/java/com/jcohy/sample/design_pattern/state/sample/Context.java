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
public interface Context {

    // 设定时间
    void setClock(int hour);

    // 状态变化
    void changeState(State state);

    // 调用保安中心
    void callSecurityCenter(String msg);

    // 保安中心保留记录
     void recordLog(String msg);

}
// end::code[]
