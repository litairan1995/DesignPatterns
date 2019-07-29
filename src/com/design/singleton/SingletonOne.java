package com.design.singleton;

/**
 * 第一种实现单例设计模式的方式
 */
public class SingletonOne {

    public static final SingletonOne INSTANCE = new SingletonOne();

    private SingletonOne(){}

    public void test(){
        System.out.println("这是第一种实现单例设计模式的方式");
    }
}
