package com.codewithsouma;


import com.codewithsouma.linkedlist.LinkedList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.getKthFromTheEnd(3));

    }
}
