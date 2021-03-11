package com.syw.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-04 13:36<br/>
 * @since JDK 1.8
 */
class SingletonNoneLazyLoadingTest {

    /**
     * 检测类能否序列化
     */
    @Test
    void testSingletonNoneLazyLoadingSerialize() throws IOException, ClassNotFoundException {
        SingletonNoneLazyLoading instance = SingletonNoneLazyLoading.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        InputStream in;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SingletonNoneLazyLoading newInstance = (SingletonNoneLazyLoading) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }

    /**
     * 测试反射对单例的影响
     */
    @Test
    void testSingletonNoneLazyLoadingReflect ()
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = SingletonNoneLazyLoading.class;
        Constructor declaredConstructor = objectClass.getDeclaredConstructor();
        //反射可以把私有构造方法设置为可以使用
        declaredConstructor.setAccessible(true);

        SingletonNoneLazyLoading instance = SingletonNoneLazyLoading.getInstance();
        SingletonNoneLazyLoading newInstance = (SingletonNoneLazyLoading) declaredConstructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}