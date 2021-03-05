package singleton;

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
 * @date: 2021-03-04 14:30<br/>
 * @since JDK 1.8
 */
class SingletonEnumTest {

    /**
     * 测试枚举类型对于序列化的影响
     */
    @Test
    void testSingletonEnum() throws IOException, ClassNotFoundException {
        SingletonEnum instance = SingletonEnum.getInstance();
        instance.setData(new Object());

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        InputStream in;
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SingletonEnum newInstance = (SingletonEnum) ois.readObject();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }

    /**
     * 测试枚举类型对于反射的影响
     */
    @Test
    void testSingletonEnumReflect() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class objectClass = SingletonEnum.class;
        Constructor declaredConstructor = objectClass.getDeclaredConstructor();
        //反射可以把私有构造方法设置为可以使用
        declaredConstructor.setAccessible(true);

        SingletonEnum instance = SingletonEnum.getInstance();
        SingletonEnum newInstance = (SingletonEnum) declaredConstructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }



}