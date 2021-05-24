package com.syw.behavior.visitor;

/**
 * <p>
 * 硬件-抽象类
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-24 14:04
 * @since JDK 1.8
 */
public abstract class Hardware {

    public Hardware(String type) {
        this.type = type;
    }

    //型号
    String type;

    public String getType() {
        return type;
    }

    //运转
    public abstract void run();

    //接受计算机访问者
    public abstract void accept(ComputerVisitor computerVisitor);
}
