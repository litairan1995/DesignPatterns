package com.design.Observer.v3;

/**
 * 加入观察者 观察者加入到被观察者内部
 *  耦合过高
 */
public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        child.weakUp();
    }

}

class Child {
    private boolean cry = false;
    private Dad dad = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void weakUp() {
        cry = true;
        dad.feed();
    }
}

class Dad {
    public void feed() {
        System.out.println("child weak up feeding");
    }
}
