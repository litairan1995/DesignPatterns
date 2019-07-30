package com.design.Observer.v5;

import java.awt.*;
import java.awt.event.WindowListener;

public class Test {
    public static void main(String[] args) {

        WechaObserver wechaObserver = new WechaObserver();

        Observer userZhang = new WeChaUser("ZhangSan");
        Observer userLi = new WeChaUser("LiSi");
        Observer userWang = new WeChaUser("WangWu");

        wechaObserver.addObserver(userZhang);
        wechaObserver.addObserver(userLi);
        wechaObserver.addObserver(userWang);
        wechaObserver.setInformation("PHP是世界上最好用的语言！");

        System.out.println("----------------------------------------------");
        wechaObserver.removeObserver(userZhang);
        wechaObserver.setInformation("JAVA是世界上最好用的语言！");

    }
}
