package com.codewithsouma;

import com.codewithsouma.array.Array;


public class Main {

    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(20);
        numbers.insert(50);
        numbers.print();
        System.out.println(numbers.indexOf(-60));
        numbers.removeAt(4);
        numbers.print();


    }
}
