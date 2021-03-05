package singleton;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-04 12:49<br/>
 * @since JDK 1.8
 */
public class SingletonThread implements Runnable{

    @Override
    public void run() {
        SingletonLazyLoading singletonLazyLoading = SingletonLazyLoading.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + singletonLazyLoading);
    }
}
