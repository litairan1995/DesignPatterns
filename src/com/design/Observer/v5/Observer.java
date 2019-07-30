package com.design.Observer.v5;

/**
 * 抽象观察者
 * 定义一个update()方法，当观察者调用notifyObserver()方法时，观察者的update()方法被回调
 */
public interface Observer {

    void update(String message);
}
