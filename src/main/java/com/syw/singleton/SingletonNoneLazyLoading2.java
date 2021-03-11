package com.syw.singleton;

/**
 * SingletonNoneLazyLoading的另外一种写法
 *
 * @author shiyanwu
 * @see SingletonNoneLazyLoading
 * <p>
 * 饿汉式单例-线程安全-none lazy loading
 * 优点：没有加锁，执行效率会提高
 * 缺点：类加载时就初始化，没有达到lazy loading 效果，可能会浪费内存
 * </p>
 */
public class SingletonNoneLazyLoading2 {

    private static final SingletonNoneLazyLoading2 INSTANCE;

    static {
        INSTANCE = new SingletonNoneLazyLoading2();
    }

    private SingletonNoneLazyLoading2() {
    }

    public static SingletonNoneLazyLoading2 getInstance() {
        return INSTANCE;
    }
}
