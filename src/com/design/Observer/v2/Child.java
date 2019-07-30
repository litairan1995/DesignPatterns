package com.design.Observer.v2;

public class Child {
    private boolean cry = false;

    public boolean isCry() {
        return cry;
    }

    public void weakUp() {
        System.out.println("weak up ! crying ....");
        cry = true;
    }
}
