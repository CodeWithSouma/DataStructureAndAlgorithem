package com.codewithsouma.heap;

public class PriorityQueueWithHeap {
    private Heap heap;

    public PriorityQueueWithHeap(int size) {
        this.heap = new Heap(size);
    }

    public void enqueue(int item){
        heap.insert(item);
    }

    public int dequeue(){
        return heap.remove();
    }

    public boolean isEmpty(){
        return heap.isEmpty();
    }

    public boolean isFull(){
        return heap.isFull();
    }
}
