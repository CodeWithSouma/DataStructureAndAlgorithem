package com.codewithsouma.stack;

public class Stack {
    private int[] stack;
    private int count = 0;
    private int top = -1;

    public Stack(int size) {
        this.stack = new int[size];
    }

    public void add(int item) {
        if (isFull()) throw new IndexOutOfBoundsException();

        stack[++top] = item;
        count++;

    }

    public int pop() {
        if (isEmpty()) throw new IndexOutOfBoundsException();

        int item = stack[top--];
        count--;
        return item;
    }

    public int peek(){
        if (isEmpty()) throw new IndexOutOfBoundsException();

        return stack[top];
    }

    public int length(){
        return count;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == stack.length - 1;
    }


}
