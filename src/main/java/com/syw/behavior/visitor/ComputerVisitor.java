package com.syw.behavior.visitor;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-24 14:07
 * @since JDK 1.8
 */
public interface ComputerVisitor {
    //访问cpu
    void visitCPU(CPU cpu);
    //访问硬盘
    void visitHardDisk(HardDisk hardDisk);
}
