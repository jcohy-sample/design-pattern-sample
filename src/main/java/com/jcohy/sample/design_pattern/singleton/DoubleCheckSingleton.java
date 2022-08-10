package com.jcohy.sample.design_pattern.singleton;

/**
 * 描述: .
 * <p>
 * Copyright © 2022 <a href="https://www.jcohy.com" target= "_blank">https://www.jcohy.com</a>
 * </p>
 *
 * @author jiac
 * @version 2022.04.0 2022/8/10:15:36
 * @since 2022.04.0
 */
// tag::code[]
public class DoubleCheckSingleton {

    /**
     * 由于指令重排优化的存在,导致初始化 DoubleCheckSingleton 和将对象地址赋给 instance 字段的顺序是不确定的.
     *
     * 在某个线程创建单例对象时,在构造方法被调用之前,就为该对象分配了内存空间并将对象的字段设置为默认值。此时就可以将分配的内存地址赋值给 instance 字段了,
     * 然而该对象可能还没有初始化.若紧接着另外一个线程来调用 getInstance,取到的就是状态不正确的对象,程序就会出错。
     *
     * volatile 的一个语义是禁止指令重排序优化, 也就保证了 instance 变量被赋值的时候对象已经是初始化过的,从而避免了上面说到的问题.
     */
    private static volatile DoubleCheckSingleton instance = null; // <1>

    public static DoubleCheckSingleton getInstance() {
        // 第一次检查（位置 1）
        if (instance == null) { // <2>
            // 这里会有多于一个线程同时到达（位置 2）。
            synchronized (DoubleCheckSingleton.class) { // <3>
                //第二次检查，这里在每个时刻只能有一个线程。（位置 3）
                if(instance == null) { // <4>
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
// end::code[]
