package com.codewithsouma.array;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count = 0;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] temp = new int[count * 2];
            for (int i = 0; i < items.length; i++)
                temp[i] = items[i];
            items = temp;
        }

        items[count++] = item;
    }

    public int length() {
        return items.length;
    }

    public int indexOf(int item) {
        if (count == 0) return -1;

        for (int i = 0; i < count; i++)
            if (items[i] == item) return i;

        return -1;
    }

    public void removeAt(int index) {
        if (index >= count || index < 0) return;

        for (int i = index; i < count - 1; i++)
            items[i] = items[i + 1];
        count--;
        items[count] = 0;
    }

    public void print() {
        System.out.println(Arrays.toString(items));
    }


}
