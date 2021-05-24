package com.syw.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 17:37
 * @since JDK 1.8
 */
public class Button implements Clickable {

    //存储注册过的单击事件观察者
    List<ClickableObserver> observerList = new ArrayList<>();

    //按键信息
    //颜色
    String color;
    //坐标
    int x, y;

    @Override
    public void click() {
        System.out.println("按钮被单击");

        //执行所有观察者的事件处理方法
        for (int i = observerList.size() - 1; i >= 0; i--) {
            observerList.get(i).clicked(this);
        }
    }

    @Override
    public void addClickableObserver(ClickableObserver clickableObserver) {
        observerList.add(clickableObserver);
    }

    @Override
    public void removeClickableObserver(ClickableObserver clickableObserver) {
        observerList.remove(clickableObserver);
    }

    @Override
    public String toString() {
        return "Button{" +
                "observerList=" + observerList +
                ", 颜色：'" + color + '\'' +
                ", 坐标：x=" + x +
                ", y=" + y +
                '}';
    }
}
