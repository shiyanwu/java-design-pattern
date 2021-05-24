package com.syw.behavior.visitor;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-24 15:15
 * @since JDK 1.8
 */
public class TypeVisitor implements ComputerVisitor{

    @Override
    public void visitCPU(CPU cpu) {
        System.out.println("CPU型号：" + cpu.getType());
    }

    @Override
    public void visitHardDisk(HardDisk hardDisk) {
        System.out.println("硬盘型号：" + hardDisk.getType());
    }
}
