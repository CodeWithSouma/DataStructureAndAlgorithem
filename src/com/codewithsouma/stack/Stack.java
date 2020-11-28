package com.codewithsouma.stack;

import java.util.Arrays;

public class Stack {
    private final int[] stack;
    private int count;

    public Stack(int size) {
        this.stack = new int[size];
    }

    public void add(int item) {
        if (isFull()) throw new StackOverflowError();

        stack[count++] = item;
    }

    public int pop() {
        if (isEmpty()) throw new IllegalStateException();

        return stack[--count];
    }

    public int peek() {
        if (isEmpty()) throw new IndexOutOfBoundsException();

        return stack[count - 1];
    }

    public int length() {
      return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == stack.length;
    }

    @Override
    public String toString() {
        var content = Arrays.copyOfRange(stack,0,count);
        return Arrays.toString(content);
    }
}
