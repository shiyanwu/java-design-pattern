package com.syw.prototype.clone;

import java.util.Date;
import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-18 13:34
 * @since JDK 1.8
 */
class PigTest {

    @Test
    void test() throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();

        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getBirthday().setTime(66666666666L);

        System.out.println(pig1);
        System.out.println(pig2);
    }

}