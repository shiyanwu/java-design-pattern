package com.syw.behavior.visitor;

import org.junit.jupiter.api.Test;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-05-24 15:23
 * @since JDK 1.8
 */
class ComputerTest {

    @Test
    void test(){
        Computer computer = new Computer(new CPU("Intel Corei7-620"), new HardDisk("Seagate 500G 7200转"));
        ComputerVisitor typeVisitor = new TypeVisitor();
        ComputerVisitor runVisitor = new RunVisitor();
        computer.accept(typeVisitor);
        System.out.println("---------------------------");
        computer.accept(runVisitor);
    }

}