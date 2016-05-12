package com.octoguac.datastructures;

public class Set {
    Object[] items;
    int size = 0;

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
        for (int i = 0; i < size; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public void remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (!items[i].equals(item)) {
                continue;
            }

            items[i] = items[size - 1];
            items[size--] = null;
        }
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
}
