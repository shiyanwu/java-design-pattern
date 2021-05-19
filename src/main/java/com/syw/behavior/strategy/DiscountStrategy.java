package com.syw.behavior.strategy;

/**
 * <p>
 * 抽象策略类-折扣算法抽象类
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 16:33
 * @since JDK 1.8
 */
public abstract class DiscountStrategy {
    //书的价格
    private double price = 0;

    //书的数量
    private int number = 0;

    //构造函数
    public DiscountStrategy(double price, int number) {
        this.price = price;
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    //策略方法，计算折扣额
    public abstract double calculateDiscount();
}
