package com.syw.singleton;

/**
 * 双重检查锁单例-线程安全-Lazy loading
 * 采用双锁机制，安全且在多线程情况下能保持高性能
 *
 * @author shiyanwu
 */
public class SingletonDoubleCheckLazyLoading {

    /**
     * volatile 修饰，避免重排序
     */
    private static volatile SingletonDoubleCheckLazyLoading instance;

    private SingletonDoubleCheckLazyLoading() {
    }

    public static SingletonDoubleCheckLazyLoading getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckLazyLoading.class) {
                if (instance == null) {
                    /**
                     * 1.分配内存
                     * 2.初始化对象
                     * 3.设置指向刚分配的内存地址
                     * 2和3会有重排序（单线程不会有问题，多线程的时候使用volatile关键字，避免重排序）
                     */
                    instance = new SingletonDoubleCheckLazyLoading();
                }
            }
        }
        return instance;
    }
}
