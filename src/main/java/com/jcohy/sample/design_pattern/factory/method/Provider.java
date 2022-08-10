package com.jcohy.sample.design_pattern.factory.method;

import com.jcohy.sample.design_pattern.factory.Sender;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:01:20
 * @since 2022.04.0
 */
// tag::code[]
public interface Provider {
    Sender produce();
}
// end::code[]
