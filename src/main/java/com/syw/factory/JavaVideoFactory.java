package com.syw.factory;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-11 14:02
 * @since JDK 1.8
 */
public class JavaVideoFactory extends VideoFactory {

    @Override
    public Video getVideo () {
        return new JavaVideo();
    }
}
