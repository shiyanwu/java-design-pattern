package com.syw.behavior.agency;

/**
 * <p>
 * 中介者抽象类
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 11:36
 * @since JDK 1.8
 */
public abstract class Mediator {
    //注册同事
    abstract void register(Colleague colleague);

    //通知中介者，发送消息
    abstract void relay(Colleague colleague);
}
