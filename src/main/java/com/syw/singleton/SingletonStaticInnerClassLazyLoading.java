package com.syw.singleton;

/**
 * 通过静态内部类方式单例-线程安全--Lazy loading
 * 利用classloader 的机制来保证初始化instance时只有一个线程，所以是线程安全的，同时没有性能损耗
 *
 * @author shiyanwu
 */
public class SingletonStaticInnerClassLazyLoading {

    private static class SingletonHolder {

        private static final SingletonStaticInnerClassLazyLoading INSTANCE = new SingletonStaticInnerClassLazyLoading();
    }

    private SingletonStaticInnerClassLazyLoading() {
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static final SingletonStaticInnerClassLazyLoading getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
