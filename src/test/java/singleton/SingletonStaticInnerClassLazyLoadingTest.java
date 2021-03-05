package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-04 14:06<br/>
 * @since JDK 1.8
 */
class SingletonStaticInnerClassLazyLoadingTest {

    /**
     * 测试静态内部类 反射对单例的影响
     */
    @Test
    void testSingletonNoneLazyLoadingReflect()
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = SingletonStaticInnerClassLazyLoading.class;
        Constructor declaredConstructor = objectClass.getDeclaredConstructor();
        //反射可以把私有构造方法设置为可以使用
        declaredConstructor.setAccessible(true);

        SingletonStaticInnerClassLazyLoading instance = SingletonStaticInnerClassLazyLoading.getInstance();
        SingletonStaticInnerClassLazyLoading newInstance = (SingletonStaticInnerClassLazyLoading) declaredConstructor
                .newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}