package com.codewithsouma.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void show(){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(5);
        list.addLast(40);

        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        System.out.println(list.size());
        System.out.println(list);

        var array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
