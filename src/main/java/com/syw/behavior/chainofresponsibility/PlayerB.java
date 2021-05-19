package com.syw.behavior.chainofresponsibility;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 17:15
 * @since JDK 1.8
 */
public class PlayerB extends Player{

    public PlayerB(Player successor) {
        this.setSuccessor(successor);
    }

    //实现handle方法
    @Override
    public void handle(int i) {
        if (i == 1) {
            System.out.println("PlayerB 喝酒！");
        } else {
            System.out.println("PlayerB 把花向下传！");
            next(i);
        }
    }
}
