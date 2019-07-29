package com.design.strategy;

public class Sort<T> {

    public T[] sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                minPos = comparator.compare(arr[i], arr[j]) == 1 ? j : minPos;
            }
            swap(arr, i, minPos);
        }
        return arr;
    }

    private void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
