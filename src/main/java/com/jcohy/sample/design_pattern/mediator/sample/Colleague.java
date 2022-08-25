package com.jcohy.sample.design_pattern.mediator.sample;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/25:11:50
 * @since 2022.04.0
 */
// tag::code[]
public interface Colleague {

    void setMediator(Mediator mediator);

    void setColleagueEnabled(boolean enabled);

}
// end::code[]
