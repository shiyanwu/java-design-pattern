package com.syw.behavior.strategy;


import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 16:56
 * @since JDK 1.8
 */
class ContextClientTest {

    @Test
    public void test() {
        ContextClient context0 = new ContextClient(new NoDiscountStrategy(48.5, 20));
        System.out.println("0折扣：" + context0.contextCalDisc());

        ContextClient contextFix = new ContextClient(new FixDiscountStrategy(46, 60));
        System.out.println("固定折扣：" + contextFix.contextCalDisc());

        ContextClient contextPer = new ContextClient(new PercentageDiscountStrategy(38, 40));
        System.out.println("15%的折扣：" + contextPer.contextCalDisc());
    }
}