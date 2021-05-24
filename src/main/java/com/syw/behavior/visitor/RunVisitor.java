package com.syw.behavior.visitor;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-24 15:18
 * @since JDK 1.8
 */
public class RunVisitor implements ComputerVisitor{

    @Override
    public void visitCPU(CPU cpu) {
        cpu.run();
    }

    @Override
    public void visitHardDisk(HardDisk hardDisk) {
        hardDisk.run();
    }
}
