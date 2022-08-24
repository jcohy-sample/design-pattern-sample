package com.jcohy.sample.design_pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:18:03
 * @since 2022.04.0
 */
// tag::code[]
public class Context {

    private final Map<Variable,Boolean> map = new HashMap<>();

    public void assign(Variable var,boolean value) {
        map.put(var, value);
    }

    public boolean lookup(Variable variable) {
        Boolean value = map.get(variable);
        if ( value == null ) {
            throw new IllegalArgumentException();
        }
        return value;
    }
}
// end::code[]
