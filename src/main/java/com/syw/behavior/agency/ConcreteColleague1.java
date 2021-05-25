package com.syw.behavior.agency;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 11:44
 * @since JDK 1.8
 */
public class ConcreteColleague1 extends Colleague{

    @Override
    public void receive() {
        System.out.println("Colleague1 receive message.");
    }

    @Override
    public void send() {
        System.out.println("colleague1 send message.");
        //请中介者转发
        this.mediator.relay(this);
    }
}
