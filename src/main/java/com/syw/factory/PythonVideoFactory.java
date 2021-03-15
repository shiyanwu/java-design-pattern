package com.syw.factory;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-11 14:03
 * @since JDK 1.8
 */
public class PythonVideoFactory extends VideoFactory{

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
