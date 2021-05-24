package com.syw.behavior.observer;

/**
 * <p>
 * Clickable接口
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 17:32
 * @since JDK 1.8
 */
public interface Clickable {
    //单击
    void click();

    //添加单击事件的观察者
    void addClickableObserver(ClickableObserver clickableObserver);

    //移除单击事件的观察者
    void removeClickableObserver(ClickableObserver clickableObserver);
}
