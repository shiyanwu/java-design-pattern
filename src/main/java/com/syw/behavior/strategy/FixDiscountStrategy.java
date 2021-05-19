package com.syw.behavior.strategy;

/**
 * <p>
 * 固定折扣策略
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 16:48
 * @since JDK 1.8
 */
public class FixDiscountStrategy extends DiscountStrategy{

    public FixDiscountStrategy(double price, int number) {
        super(price, number);
    }

    @Override
    public double calculateDiscount() {
        return getNumber()*1;
    }
}
