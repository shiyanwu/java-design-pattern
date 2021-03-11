package com.syw.singleton;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-04 12:38<br/>
 * @since JDK 1.8
 */
class SingletonLazyLoadingTest {

    @Test
    public void testSingleton() {
        SingletonLazyLoading singletonLazyLoading = SingletonLazyLoading.getInstance();
        System.out.println("program end");
    }

    /**
     * 多线程测试
     */
    @Test
    public void testSingletonThread() {
        Thread t1 = new Thread(new SingletonThread());
        Thread t2 = new Thread(new SingletonThread());
        t1.start();
        t2.start();
        System.out.println("program end");
    }
}