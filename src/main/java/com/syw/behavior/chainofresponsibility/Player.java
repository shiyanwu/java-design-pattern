package com.syw.behavior.chainofresponsibility;

/**
 * <p>
 * 传花者抽象类
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 17:10
 * @since JDK 1.8
 */
public abstract class Player {
    private Player successor;
    public abstract void handle(int i);

    public void setSuccessor(Player successor) {
        this.successor = successor;
    }

    //传给下一个
    public void next(int index) {
        if (successor != null) {
            successor.handle(index);
        } else {
            System.out.println("游戏结束");
        }
    }
}
