package com.syw.behavior.iterator;

import java.util.List;

/**
 * <p>
 * 购物车实现类
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 16:12
 * @since JDK 1.8
 */
public class ShoppingCartIteratorImpl implements ShoppingCartIterator {

    private List goodsList;
    int position;
    Goods goods;

    public ShoppingCartIteratorImpl(List goodsList) {
        this.goodsList = goodsList;
    }

    @Override
    public Goods nextGoods() {
        System.out.println("购物车，位置是：" + position);
        goods = (Goods) goodsList.get(position);
        position++;
        return goods;
    }

    @Override
    public boolean isLastGoods() {
        return position >= goodsList.size();
    }
}
