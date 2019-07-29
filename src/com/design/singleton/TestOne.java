package com.design.singleton;

public class TestOne {

    public static void main(String[] args) {
        SingletonOne INSTANCE = SingletonOne.INSTANCE;
        INSTANCE.test();
    }
}
