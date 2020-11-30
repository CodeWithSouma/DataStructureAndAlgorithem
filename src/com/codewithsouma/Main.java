package com.codewithsouma;


import com.codewithsouma.queue.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Queue;


public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());

        System.out.println(queue);

    }

/*    public static void reverse(Queue<Integer> queue){
        if (queue.isEmpty()) return;

        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.add(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());
    }*/
}
