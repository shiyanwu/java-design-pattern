package com.syw.behavior.strategy;

/**
 * <p>
 * 具体策略类-0折扣
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 16:34
 * @since JDK 1.8
 */
public class NoDiscountStrategy extends DiscountStrategy {

    public NoDiscountStrategy(double price, int number) {
        super(price, number);
    }

    //实现策略方法，0折扣额
    @Override
    public double calculateDiscount() {
        return 0;
    }
}
