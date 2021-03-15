package com.syw.factory.abstractfactory;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-15 13:38
 * @since JDK 1.8
 */
public class JavaArticle extends Article{

    @Override
    public void produce() {
        System.out.println("录制java手记");
    }
}
