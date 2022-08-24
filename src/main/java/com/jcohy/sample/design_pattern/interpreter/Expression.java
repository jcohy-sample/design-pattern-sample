package com.jcohy.sample.design_pattern.interpreter;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/24:18:02
 * @since 2022.04.0
 */
// tag::code[]
public abstract class Expression {

    /**
     * 以 Context 为准，本方法解释给定的任何一个表达式
     * 文法如下:
     * Expression ::=
     *          Expression AND Expression
     *        | Expression OR Expression
     *        | NOT Expression
     *        | Variable
     *        | Constant
     * Variable ::=... // 可以打印出非空白字符串
     * Constant ::= "true" | "false"
     */
    public abstract boolean interpret(Context context);

    /**
     * 检查两个表达式在结构上是否相同
     */
    public abstract boolean equals(Object o);

    public abstract int hashCode();

    public abstract String toString();
}
// end::code[]
