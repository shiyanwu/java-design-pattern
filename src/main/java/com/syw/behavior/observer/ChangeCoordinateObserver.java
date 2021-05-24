package com.syw.behavior.observer;

/**
 * <p>
 * 修改按键坐标的观察者
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 18:29
 * @since JDK 1.8
 */
public class ChangeCoordinateObserver implements ClickableObserver {

    @Override
    public void clicked(Clickable clickable) {
        Button button = (Button) clickable;
        button.x = 100;
        button.y = 90;
    }
}
