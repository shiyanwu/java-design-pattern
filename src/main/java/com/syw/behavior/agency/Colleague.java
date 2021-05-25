package com.syw.behavior.agency;

/**
 * <p>
 * 同事抽象类
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 11:35
 * @since JDK 1.8
 */
public abstract class Colleague {
    //中介者抽象类
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //接收消息
    public abstract void receive();

    //发送消息
    public abstract void send();

}
