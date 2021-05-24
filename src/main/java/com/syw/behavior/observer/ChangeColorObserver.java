package com.syw.behavior.observer;

/**
 * <p>
 * 修改按键颜色的观察者
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 18:02
 * @since JDK 1.8
 */
public class ChangeColorObserver implements ClickableObserver{

    @Override
    public void clicked(Clickable clickable) {
        Button button = (Button) clickable;
        button.color = "红色";
    }
}
