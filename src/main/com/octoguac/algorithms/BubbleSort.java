package com.octoguac.algorithms;


public class BubbleSort {
    public void sortArray(Object[] array) {
        boolean swapped = true;
        int sortedCount = 1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - sortedCount; i++) {
                if (array[i].hashCode() > array[i + 1].hashCode()) {
                    Object temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            sortedCount++;
        }
    }
}