package com.syw.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 购物车迭代器实现类
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 16:14
 * @since JDK 1.8
 */
public class ShoppingCartImpl implements ShoppingCart {

    private List goodsList;

    public ShoppingCartImpl() {
        this.goodsList = new ArrayList();
    }

    @Override
    public void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    @Override
    public void removeGoods(Goods goods) {
        goodsList.remove(goods);
    }

    @Override
    public ShoppingCartIterator getIterator() {
        return new ShoppingCartIteratorImpl(goodsList);
    }
}
