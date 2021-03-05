package singleton;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-04 18:23
 * @since JDK 1.8
 */
class ThreadLocalInstanceTest {

    @Test
    void test() {
        Thread t1 = new Thread(new TLocalInstance());
        Thread t2 = new Thread(new TLocalInstance());
        t1.start();
        t2.start();

        System.out.println("program end");
    }

}