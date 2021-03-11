package com.syw.singleton;

/**
 * 懒汉式单例-线程安全-Lazy loading
 * 优点：1.具备Lazy loading，第一次调用才初始化，避免内存浪费 2.能够在多线程中很好的工作
 * 缺点：1.必须加锁 synchronized 才能保证单例，但加锁会影响效率，99%情况下不需要同步
 *
 * @author shiyanwu
 */
public class SingletonLazyLoadingSynchronized {

    private static SingletonLazyLoadingSynchronized instance;

    private SingletonLazyLoadingSynchronized() {
    }

    public static synchronized SingletonLazyLoadingSynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonLazyLoadingSynchronized();
        }
        return instance;
    }
}
