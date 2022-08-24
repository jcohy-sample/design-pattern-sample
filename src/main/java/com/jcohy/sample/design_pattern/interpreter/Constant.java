package com.jcohy.sample.design_pattern.interpreter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:18:05
 * @since 2022.04.0
 */
// tag::code[]
public class Constant extends Expression {
    // 代表 boolean 常量。

    private boolean value;

    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret(Context context) {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Constant) {
            return this.value == ((Constant) o).value;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
// end::code[]
