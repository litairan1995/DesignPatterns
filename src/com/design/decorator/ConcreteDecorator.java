package com.design.decorator;

/**
 * 具体装饰类
 */
public class ConcreteDecorator extends Decorator {


    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void biu() {
        System.out.println("reday?go");
        super.biu();
    }
}