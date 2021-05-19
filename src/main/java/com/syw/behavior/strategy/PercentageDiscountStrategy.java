package com.syw.behavior.strategy;

/**
 * <p>
 * 具体折扣，折扣百分比为15%的算法
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 16:50
 * @since JDK 1.8
 */
public class PercentageDiscountStrategy extends DiscountStrategy{

    public PercentageDiscountStrategy(double price, int number) {
        super(price, number);
    }

    //实现策略方法，百分比为15%的折扣额
    @Override
    public double calculateDiscount() {
        return getNumber() * getPrice() * 0.15;
    }
}
