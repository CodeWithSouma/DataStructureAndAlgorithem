package com.codewithsouma.sorting;

import com.codewithsouma.heap.Heap;

public class HeapSort {
    public static void sort(int[] items) {
        var heap = new Heap(items.length);
        for (int item : items)
            heap.insert(item);
        for (int i = items.length -1; i >= 0; i--) items[i] = heap.remove();
    }

}
