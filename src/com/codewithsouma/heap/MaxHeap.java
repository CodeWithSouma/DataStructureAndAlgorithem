package com.codewithsouma.heap;

public class MaxHeap {
    public static void heapify(int[] array) {
        int lastParentIndex = array.length / 2 -1;
        for (var i = lastParentIndex; i >=0; i--)
            heapify(array, i);
    }

    private static void heapify(int[] array, int index) {
        var largerIndex = index;

        var leftIndex =  leftChildIndex(index);
        if (leftIndex < array.length &&
                array[leftIndex] > array[largerIndex])
            largerIndex = leftIndex;

        var rightIndex = rightChildIndex(index);
        if (rightIndex < array.length &&
                array[rightIndex] > array[largerIndex])
            largerIndex = rightIndex;

        if (index == largerIndex)
            return;

        swap(array, index, largerIndex);
        heapify(array, largerIndex);
    }

    private static int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    private static int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    private static void swap(int[] array, int first, int second) {
        var temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
