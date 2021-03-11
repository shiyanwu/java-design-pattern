package com.syw.singleton;

/**
 * 懒汉式单例-非线程安全-Lazy loading
 * 这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 *
 * @author shiyanwu
 */
public class SingletonLazyLoading {

    private static SingletonLazyLoading instance;

    private SingletonLazyLoading() {
    }

    public static SingletonLazyLoading getInstance() {
        if (instance == null) {
            instance = new SingletonLazyLoading();
        }
        return instance;
    }
}
