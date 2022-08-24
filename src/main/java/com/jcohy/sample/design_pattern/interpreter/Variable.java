package com.jcohy.sample.design_pattern.interpreter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:18:08
 * @since 2022.04.0
 */
// tag::code[]
public class Variable extends Expression {

    // 变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public boolean interpret(Context context) {
        return context.lookup(this);
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof Variable) {
            return this.name.equals(((Variable) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
// end::code[]
