package singleton;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-04 17:09
 * @since JDK 1.8
 */
public class TLocalInstance implements Runnable {

    @Override
    public void run() {
        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
