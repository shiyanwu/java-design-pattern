package com.syw.behavior.visitor;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-24 14:08
 * @since JDK 1.8
 */
public class CPU extends Hardware{

    public CPU(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为："+ type + "的CPU正在运转");
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visitCPU(this);
    }
}
