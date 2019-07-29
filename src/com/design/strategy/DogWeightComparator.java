package com.design.strategy;

public class DogWeightComparator implements Comparator<Dog> {


    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1.weight < o2.weight) return -1;
        else if (o1.weight > o2.weight) return 1;
        else return 0;
    }
}
