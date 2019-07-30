package com.design.decorator;

/**
 * 装饰类
 */
public class Decorator implements Component {

    public Component component;


    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void biu() {
        component.biu();
    }
}
