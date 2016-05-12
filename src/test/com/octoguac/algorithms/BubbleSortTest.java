package com.octoguac.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Aaron on 4/21/2016.
 */
public class BubbleSortTest {
    BubbleSort bubbleSort = new BubbleSort();
    Object[] sortedIntArray = new Object[]{1, 3, 4, 5, 6, 7, 10};
    Object[] sortedStringArray = new Object[]{"B", "X", "a", "c", "f", "g", "z"};

    Object[] rabbit = new Object[]{10, 4, 3, 1, 6, 5, 7};
    Object[] turtle = new Object[]{4, 3, 6, 10, 5, 7, 1};
    Object[] stringArray = new Object[]{"c", "g", "a", "B", "X", "z", "f"};

    @Test
    public void sortArrayTest() {
        bubbleSort.sortArray(rabbit);
        assertArrayEquals(sortedIntArray, rabbit);

        bubbleSort.sortArray(turtle);
        assertArrayEquals(sortedIntArray, turtle);

        bubbleSort.sortArray(stringArray);
        assertArrayEquals(sortedStringArray, stringArray);
    }
}