package com.codewithsouma;


import com.codewithsouma.queue.QueueWithTwoStack;


public class Main {

    public static void main(String[] args) {
        QueueWithTwoStack queue = new QueueWithTwoStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());




    }


}
