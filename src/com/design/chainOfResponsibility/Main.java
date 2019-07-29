package com.design.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Message message = new Message();
        message.setName("大家好:)");
        message.setMessage("欢迎大家访问：mashibing.com 大家都是996嘛？");
        ChainFilter filters = new ChainFilter();
        filters.add(new HTMLFilter()).add(new SensitivityFilter());

        ChainFilter filters2 = new ChainFilter();
        filters2.add(new FaceFilter()).add(new URLFilter());

        filters.add(filters2);

        System.out.println(message);
        filters.doFilter(message);
        System.out.println(message);
    }
}
