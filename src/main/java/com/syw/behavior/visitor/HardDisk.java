package com.syw.behavior.visitor;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-24 14:15
 * @since JDK 1.8
 */
public class HardDisk extends Hardware{

    public HardDisk(String type) {
        super(type);
    }

    @Override
    public void run() {
        System.out.println("型号为" + type + "的硬盘正在运转");
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visitHardDisk(this);
    }
}
