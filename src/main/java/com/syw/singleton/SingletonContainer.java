package com.syw.singleton;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/**
 * <p>
 * 容器-单例模式
 * 这种方式不是线程安全的，如果使用HashTable会影响性能，这个要参考具体的应用场景。
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-04 14:52
 * @since JDK 1.8
 */
public class SingletonContainer {

    private static Map<String, Object> singletonMap = new HashMap<>();

    private SingletonContainer() {
    }

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!singletonMap.containsKey(key)) {
                singletonMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }
}