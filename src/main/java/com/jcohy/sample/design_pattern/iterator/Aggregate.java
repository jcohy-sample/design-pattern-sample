package com.jcohy.sample.design_pattern.iterator;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/17:12:12
 * @since 2022.04.0
 */
// tag::code[]
public interface Aggregate {

    // 一个执行递增的 "聚合" ，实现此接口的类就变成类似数组的 "多个数字或者变量的聚合"
   Iterator iterator();
}
// end::code[]
