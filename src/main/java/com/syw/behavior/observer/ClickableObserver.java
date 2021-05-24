package com.syw.behavior.observer;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 17:35
 * @since JDK 1.8
 */
public interface ClickableObserver {
    //发生单击事件时的操作
    void clicked(Clickable clickable);
}
