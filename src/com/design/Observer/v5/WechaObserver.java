package com.design.Observer.v5;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 */
public class WechaObserver implements ObserverAble {

    private List<Observer> observers;

    private String message;

    public WechaObserver() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (!observers.isEmpty()) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setInformation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息：" + s);
        //消息更新 通知所有观察者
        notifyObserver();
    }
}
