package com.octoguac.datastructures;

public class Set {
    Object[] items;
    int size = 0;
    private final int defaultIndex = -1;

    public Set() {
        items = new Object[10];
    }

    public Set(int size) {
        items = new Object[size];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Object item) {
        if (item == null || contains(item)) {
            return;
        }

        if (size == items.length) {
            expandSet();
        }

        items[size++] = item;
    }

    public boolean contains(Object item) {
        return findItemIndex(item) >= 0;
    }

    public void remove(Object item) {
        int index = findItemIndex(item);
        if (index == defaultIndex) {
            return;
        }

        items[index] = items[--size];
        items[size] = null;
    }

    public int size() {
        return size;
    }

    private void expandSet() {
        Object[] temp = new Object[size * 2];

        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }

        items = temp;
    }

    private int findItemIndex(Object item) {
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                return i;
            }
        }
        return defaultIndex;
    }
}