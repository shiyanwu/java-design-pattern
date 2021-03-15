package com.syw.factory.abstractfactory;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-15 13:35
 * @since JDK 1.8
 */
public class JavaCourseFactory implements CourseFactory{

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
