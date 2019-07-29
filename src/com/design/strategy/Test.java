package com.design.strategy;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Dog[] arr = {new Dog(1, 3), new Dog(5, 4), new Dog(3, 4)};
        DogWeightComparator dogWeightComparator = new DogWeightComparator();
        Sort<Dog> sort = new Sort<>();
        arr =  sort.sort(arr, dogWeightComparator);
        System.out.println(Arrays.toString(arr));
    }
}
