package com.codewithsouma.heap;

public class Heap {
    private int[] items;
    private int size;

    public Heap(int size) {
        items = new int[size];
    }

    public void insert(int value) {
        if (isFull())
            throw new IllegalStateException();

        items[size++] = value;
        bubbleUp();
    }

    public int remove() {
        if(isEmpty())
            throw new IllegalStateException();

        var item = items[0];
        items[0] = items[--size];
        babbleDown();

        return item;
    }

    private void babbleDown() {
        int index = 0;
        while (index <= size && !isValidParent(index)) {
            var largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);
            index = largerChildIndex;
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    private int largerChildIndex(int index){
        if (!hasLeftChild(index)) return index;
        if(!hasRightChild(index)) return leftChildIndex(index);
        return (leftChild(index) > rightChild(index)) ? leftChildIndex(index) : rightChildIndex(index);
    }

    private boolean hasLeftChild(int index){
        return leftChildIndex(index) <= size;
    }

    private boolean hasRightChild(int index){
        return rightChildIndex(index) <= size;
    }

    private boolean isValidParent(int index) {
        if(!hasLeftChild(index))
            return true;

        var isValid = items[index] >= leftChild(index);
        if (hasRightChild(index))
            return isValid &= items[index] >= rightChild(index);

        return  isValid;
    }

    private int rightChild(int index) {
        return items[rightChildIndex(index)];
    }

    private int leftChild(int index) {
        return items[leftChildIndex(index)];
    }

    private int leftChildIndex(int index) {
        return (index * 2) + 1;
    }

    private int rightChildIndex(int index) {
        return (index * 2) + 2;
    }

    public boolean isFull() {
        return size == items.length;
    }

    private void bubbleUp() {
        int index = size - 1;
        while (index > 0 && items[index] > parent(index)) {
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    private int parent(int index) {
        return items[parentIndex(index)];
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    public int max() {
        if (isEmpty()) throw new IllegalStateException();
        return items[0];
    }
}
