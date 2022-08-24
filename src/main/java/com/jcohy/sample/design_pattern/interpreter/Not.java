package com.jcohy.sample.design_pattern.interpreter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:18:14
 * @since 2022.04.0
 */
// tag::code[]
public class Not extends Expression {

    // new Not(x) 代表 Not x
    private Expression exp;

    public Not(Expression exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpret(Context context) {
        return !exp.interpret(context);
    }

    @Override
    public boolean equals(Object o) {
        if( o != null && o instanceof Not) {
            return this.exp.equals(((Not) o).exp) ;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "( Not " + exp.toString() + ")";
    }
}
// end::code[]
