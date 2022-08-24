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
public class Or extends Expression {
    // new Or(x,y) 代表 x or y
    private Expression left, right;

    public Or(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean interpret(Context context) {
        return left.interpret(context) || right.interpret(context);
    }

    @Override
    public boolean equals(Object o) {
        if( o != null && o instanceof Or) {
            return this.left.equals(((Or) o).left) && this.right.equals(((Or) o).right);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " OR " + right.toString() + ")";
    }
}
// end::code[]
