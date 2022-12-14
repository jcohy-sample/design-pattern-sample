package com.jcohy.sample.design_pattern.singleton;

/**
 *
 * 第一种: 饿汉模式 饿汉模式在类加载的时候就对实例进行创建，实例在整个程序周期都存在。
 * 它的好处是只在类加载的时候创建一次实例，不会存在多个线程创建多个实例的情况，避免了多线程同步的问题。
 * 它的缺点也很明显，即使这个单例没有用到也会被创建，而且在类加载之后就被创建，内存就被浪费了。
 * <p>
 * 持有私有静态实例，防止被引用，此处赋值为 null，目的是实现延迟加载
 * <p>
 * 私有划静态方法
 */
// tag::code[]
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
// end::code[]
