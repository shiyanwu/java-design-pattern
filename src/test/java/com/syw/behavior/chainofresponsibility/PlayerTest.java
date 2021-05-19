package com.syw.behavior.chainofresponsibility;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 17:21
 * @since JDK 1.8
 */
class PlayerTest {

    @Test
    void test() {
        //创建一个链
        Player player = new PlayerA(new PlayerB(new PlayerC(new PlayerD(null))));

        //击鼓3下，停下
        player.handle(3);
    }
}