package com.syw.singleton;

/**
 * <p>
 * 线程中唯一
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-04 17:00
 * @since JDK 1.8
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstance = ThreadLocal
            .withInitial(() -> new ThreadLocalInstance());

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return threadLocalInstance.get();
    }
}
