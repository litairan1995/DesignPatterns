package com.design.Observer.v4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.weakUp();
    }
}


interface Observer {
    void actionOnWeakUp(Event event);
}

/**
 * 事件类
 */
class Event {
    String loc;

    public Event(String loc) {
        this.loc = loc;
    }
}

/**
 * 被观察者
 */
class Child {
    private boolean cry = false;

    List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
    }

    public boolean isCry() {
        return cry;
    }

    public void weakUp() {
        cry = true;

        Event event = new Event("bed");

        for (Observer observer : observers) {
            observer.actionOnWeakUp(event);
        }
    }
}

/**
 * 观察者
 */
class Dad implements Observer {
    @Override
    public void actionOnWeakUp(Event event) {
        System.out.println("dad feed");
    }
}

/**
 * 观察者
 */
class Mum implements Observer {
    @Override
    public void actionOnWeakUp(Event event) {
        System.out.println("mum hug");
    }
}


