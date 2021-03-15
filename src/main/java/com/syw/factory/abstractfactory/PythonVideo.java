package com.syw.factory.abstractfactory;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-15 13:36
 * @since JDK 1.8
 */
public class PythonVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制python课程视频");
    }
}
