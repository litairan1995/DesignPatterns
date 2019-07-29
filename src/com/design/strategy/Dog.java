package com.design.strategy;

public class Dog implements Comparable {

    public int weight;

    public int height;

    public Dog(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int CompareTo(Object o) {
        Dog d = (Dog) o;
        if (this.weight < d.weight) return -1;
        else if (this.weight > d.weight) return 1;
        return 0;
    }
}
