package com.design.Observer.v5;


/**
 * 定义一个抽象被观察者接口
 * 声明添加 删除  通知观察者方法
 */
public interface ObserverAble {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
