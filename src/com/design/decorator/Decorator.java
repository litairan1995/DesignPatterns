package com.design.decorator;

/**
 * 被装饰类
 */
public class Decorator implements Component {

    //维护一个Component 对象
    public Component component;


    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void biu() {
        component.biu();
    }
}
