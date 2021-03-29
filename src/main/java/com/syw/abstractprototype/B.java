package com.syw.abstractprototype;

/**
 * <p>
 * 功能描述
 * <p/>
 *
 * @author shiyanwu
 * @date: 2021-03-18 13:21
 * @since JDK 1.8
 */
public class B extends A{

    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        b.clone();
    }
}
