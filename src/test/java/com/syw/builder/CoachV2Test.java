package com.syw.builder;

import com.syw.builder.V2.Course;
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
class CoachV2Test {

    @Test
    void test() {
        Course course = new Course.CourseBuilder().buildCourseName("Java设计模式精讲").buildCoursePPT("Java设计模式精讲PPT")
                .build();

        System.out.println(course);
    }
}