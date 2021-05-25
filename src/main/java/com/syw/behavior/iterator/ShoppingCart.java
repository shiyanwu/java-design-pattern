package com.syw.behavior.iterator;

/**
 * <p>
 * 购物车接口
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 16:08
 * @since JDK 1.8
 */
public interface ShoppingCart {
    void addGoods(Goods goods);
    void removeGoods(Goods goods);

    ShoppingCartIterator getIterator();
}
