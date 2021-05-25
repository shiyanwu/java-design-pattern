package com.syw.behavior.agency;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-25 11:40
 * @since JDK 1.8
 */
public class ConcreteMediator extends Mediator {

    //被中介者代理的同事
    private List<Colleague> colleagueList;

    public ConcreteMediator() {
        colleagueList = new ArrayList<>();
    }

    @Override
    void register(Colleague colleague) {
        if (!colleagueList.contains(colleague)) {
            colleague.setMediator(this);
            this.colleagueList.add(colleague);
        }
    }

    @Override
    void relay(Colleague colleague) {
        colleagueList.forEach(c -> {
            if (!c.equals(colleague)) {
                c.receive();
            }
        });
    }
}
