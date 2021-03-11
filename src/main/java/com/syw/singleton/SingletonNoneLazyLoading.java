package com.syw.singleton;

import java.io.Serializable;

/**
 * 饿汉式单例-线程安全-none lazy loading
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载时就初始化，没有达到lazy loading 效果，可能会浪费内存
 *
 * @author shiyanwu
 */
public class SingletonNoneLazyLoading implements Serializable {

    private static final SingletonNoneLazyLoading INSTANCE = new SingletonNoneLazyLoading();

    private SingletonNoneLazyLoading() {
        if (INSTANCE != null) {
            throw new RuntimeException("单例构造器禁止反射调用！");
        }
    }

    public static SingletonNoneLazyLoading getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
