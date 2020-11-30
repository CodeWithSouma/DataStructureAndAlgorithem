package com.codewithsouma.queue;

import java.util.Arrays;

public class ArrayQueue {
    private final int [] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item){
        if (isFull())
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue(){
        if (isEmpty())
            throw new IllegalStateException();

        int item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public  int peek(){
        if (isEmpty())
            throw new IllegalStateException();

        return items[front];
    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        if(count == 0){
            front = 0;
            rear = 0;
            isEmpty = true;
        }
        return isEmpty;
    }

    public boolean isFull(){
       return count == items.length;
    }

    @Override
    public String toString() {
        int[] array = new int[count];
        int index = front;
        for (int i = 0; i < count; i++){
            array[i] = items[index];
            index = (index + 1) % items.length;
        }

        return Arrays.toString(array);
    }
}
