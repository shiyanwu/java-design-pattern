package com.syw.behavior.iterator;

/**
 * <p>
 * 购物车迭代器-接口
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 16:10
 * @since JDK 1.8
 */
public interface ShoppingCartIterator {
    //下一个所购物品
    Goods nextGoods();
    boolean isLastGoods();
}
