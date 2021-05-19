package com.syw.behavior.strategy;

/**
 * <p>
 * 环境角色
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 16:54
 * @since JDK 1.8
 */
public class ContextClient {
    private DiscountStrategy ds;

    //构造函数
    public ContextClient(DiscountStrategy ds) {
        this.ds = ds;
    }

    public double contextCalDisc() {
        return ds.calculateDiscount();
    }
}
