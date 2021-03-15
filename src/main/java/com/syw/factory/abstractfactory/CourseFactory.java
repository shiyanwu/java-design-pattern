package com.syw.factory.abstractfactory;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-15 13:30
 * @since JDK 1.8
 */
public interface CourseFactory {
    Video getVideo();
    Article getArticle();
}
