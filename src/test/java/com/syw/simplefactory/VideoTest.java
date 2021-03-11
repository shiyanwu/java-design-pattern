package com.syw.simplefactory;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-11 11:39
 * @since JDK 1.8
 */
class VideoTest {

    @Test
    void test() {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        video.produce();
    }

    @Test
    void testReflectFactory() {
        VideoReflectFactory videoReflectFactory = new VideoReflectFactory();
        Video video = videoReflectFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}