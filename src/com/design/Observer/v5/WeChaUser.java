package com.design.Observer.v5;

/**
 * 观察者
 */
public class WeChaUser implements Observer {

    private String name;

    private String message;

    public WeChaUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        this.message = message;
        read();
    }

    public void read() {
        System.out.println(name + " 收到的推送消息： " + message);
    }
}
