package com.codewithsouma.array;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void show(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list.indexOf(10));
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.lastIndexOf(10));
        System.out.println(list.remove(0));
        System.out.println(list.contains(10));
    }
}
