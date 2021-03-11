package com.syw.singleton;

/**
 * 枚举式单例-线程安全-none Lazy loading
 * 这种方式不仅能避免多线程同步问题，而且还自动支持序列化机制，防止反序列化重新创建新的对象，绝对防止多次实例化。
 *
 * @author shiyanwu
 */

public enum SingletonEnum {
    /**
     *
     */
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static SingletonEnum getInstance() {
        return INSTANCE;
    }
}
