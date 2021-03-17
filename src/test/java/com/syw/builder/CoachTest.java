package com.syw.builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-16 13:19
 * @since JDK 1.8
 */
class CoachTest {

    @Test
    void test() {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach
                .makeCourse("Java设计模式精讲", "Java设计模式精讲PPT", "Java设计模式精讲视频", "Java设计模式精讲手记", "Java 设计模式精讲问答");
        System.out.println(course);
    }
}