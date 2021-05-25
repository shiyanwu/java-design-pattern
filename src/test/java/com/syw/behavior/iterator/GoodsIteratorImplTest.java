package com.syw.behavior.iterator;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * 迭代器测试
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 16:22
 * @since JDK 1.8
 */
class GoodsIteratorImplTest {

    @Test
    void test() {
        Goods goods1 = new Goods("面包");
        Goods goods2 = new Goods("果汁");
        Goods goods3 = new Goods("火腿肠");
        Goods goods4 = new Goods("牛奶");
        Goods goods5 = new Goods("鸡蛋");
        Goods goods6 = new Goods("巧克力");

        ShoppingCart shoppingCart = new ShoppingCartImpl();
        shoppingCart.addGoods(goods1);
        shoppingCart.addGoods(goods2);
        shoppingCart.addGoods(goods3);
        shoppingCart.addGoods(goods4);
        shoppingCart.addGoods(goods5);
        shoppingCart.addGoods(goods6);

        System.out.println("----购物清单----");
        printGoods(shoppingCart);

        shoppingCart.removeGoods(goods4);
        shoppingCart.removeGoods(goods5);
        System.out.println("----舍弃不想要的物品后的购物清单----");
        printGoods(shoppingCart);

    }

    public void printGoods(ShoppingCart shoppingCart) {
        ShoppingCartIterator shoppingCartIterator = shoppingCart.getIterator();
        while (!shoppingCartIterator.isLastGoods()) {
            Goods goods = shoppingCartIterator.nextGoods();
            System.out.println("物品是：" + goods.getName());
        }

    }
}