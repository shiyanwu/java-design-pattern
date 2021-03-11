package com.syw.simplefactory;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-11 11:41
 * @since JDK 1.8
 */
public class VideoFactory {

    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        } else if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
