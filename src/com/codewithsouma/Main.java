package com.codewithsouma;


import com.codewithsouma.queue.PriorityQueue;
import com.codewithsouma.queue.QueueWithTwoStack;


public class Main {

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);

        while (!queue.isEmpty())
            System.out.println(queue.remove());
        System.out.println(queue);

    }


}
