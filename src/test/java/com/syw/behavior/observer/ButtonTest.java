package com.syw.behavior.observer;


import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-19 18:34
 * @since JDK 1.8
 */
class ButtonTest {

    @Test
    void test() {
        Button button = new Button();
        button.color = "白色";
        button.x = 0;
        button.y = 0;

        button.addClickableObserver(new ChangeColorObserver());
        button.addClickableObserver(new ChangeCoordinateObserver());
        button.addClickableObserver(new OtherObserver());

        button.click();
        System.out.println(button);
    }

}