package com.design.Observer.v2;

public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        while (!child.isCry()) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("observing....");
        }
    }
}
