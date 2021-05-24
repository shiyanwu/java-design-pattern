package com.syw.behavior.observer;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 18:31
 * @since JDK 1.8
 */
public class OtherObserver implements ClickableObserver{

    @Override
    public void clicked(Clickable clickable) {
        System.out.println("执行其他操作。。。");
    }
}
