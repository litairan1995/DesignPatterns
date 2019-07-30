package com.design.Observer.v6;


import java.util.ArrayList;
import java.util.List;

/**
 * 观察者处理不同的事件 将事件抽象为一个抽象的父类 不同的事件继承该父类
 *
 * @param <T>
 */
abstract class Event<T> {
    String message;
    T source;

    public Event(String message, T source) {
        this.message = message;
        this.source = source;
    }

    abstract T getSource();
}


class WeakUpEvent2 extends Event<Child> {
    public WeakUpEvent2(String message, Child source) {
        super(message, source);
    }

    @Override
    Child getSource() {
        return source;
    }


}


class Child {
    boolean cry = false;

    List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mum());
    }

    public boolean isCry() {
        return cry;
    }

    WeakUpEvent2 weakUpEvent2 = new WeakUpEvent2("child weak up", this);

    public void weakUp() {
        cry = true;
        for (Observer observer : observers) {
            Child child = weakUpEvent2.getSource();
            System.out.println(weakUpEvent2.message);
            System.out.println("child.isCry():" + child.isCry());
            observer.weakUpOnAction(weakUpEvent2);
        }
    }

}

interface Observer {
    void weakUpOnAction(Event event);
}


class Dad implements Observer {
    @Override
    public void weakUpOnAction(Event event) {
        System.out.println("dad feed");
    }
}


class Mum implements Observer {
    @Override
    public void weakUpOnAction(Event event) {
        System.out.println("mum hug");
    }
}


public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.weakUp();
    }
}
