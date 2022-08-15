package com.jcohy.sample.design_pattern.strategy;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/15:16:50
 * @since 2022.04.0
 */
// tag::code[]
public class Client {

    public static void main(String[] args) {
        Context ctx1 = new Context(new StrategyImplA());
        Context ctx2 = new Context(new StrategyImplB());
        Context ctx3 = new Context(new StrategyImplC());
        ctx1.contextInterface();
        ctx2.contextInterface();
        ctx3.contextInterface();
    }
}
// end::code[]
