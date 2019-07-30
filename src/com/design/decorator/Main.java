package com.design.decorator;

public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();

        Decorator decorator = new ConcreteDecorator(component);

        decorator.biu();
    }

}
