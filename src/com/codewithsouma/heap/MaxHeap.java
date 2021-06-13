package com.codewithsouma.heap;

public class MaxHeap {
    public static void heapify(int[] array) {
        var lastParentIndex = (array.length - 1) / 2;
        for (int i = lastParentIndex; i >= 0; i--)
            heapify(array, i);
    }

    private static void heapify(int[] array, int index) {
        int largerValueIndex = index;
        int leftChildIndex = getLeftChildIndex(index);
        if (leftChildIndex < array.length && array[leftChildIndex] > array[largerValueIndex])
            largerValueIndex = leftChildIndex;
        int rightChildIndex = getRightChildIndex(index);
        if (rightChildIndex < array.length && array[rightChildIndex] > array[largerValueIndex])
            largerValueIndex = rightChildIndex;
        if (largerValueIndex == index) return;

        swap(array,index,largerValueIndex);
        heapify(array,largerValueIndex);
    }

    private static void swap(int [] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int getRightChildIndex(int index) {
        return index * 2 + 2;
    }

    private static int getLeftChildIndex(int index) {
        return index * 2 + 1;
    }

    public static int getKthLargest(int [] array, int k){
        if (k < 1 || k > array.length) throw new IllegalStateException();
        var heap = new Heap(array.length);
        for (int element: array)
            heap.insert(element);
        for (int i = 1; i < k; i++)
            heap.remove();
        return heap.max();
    }
}
