package com.syw.behavior.visitor;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-24 15:19
 * @since JDK 1.8
 */
public class Computer {
    private Hardware cpu;
    private Hardware hardDisk;

    public Computer(Hardware cpu, Hardware hardDisk) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
    }

    public void accept(ComputerVisitor computerVisitor){
        cpu.accept(computerVisitor);
        hardDisk.accept(computerVisitor);
    }
}
