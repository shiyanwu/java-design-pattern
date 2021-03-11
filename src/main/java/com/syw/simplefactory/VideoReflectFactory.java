package com.syw.simplefactory;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-11 11:53
 * @since JDK 1.8
 */
public class VideoReflectFactory {

    public Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}
