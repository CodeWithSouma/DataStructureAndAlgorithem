package com.codewithsouma;


import com.codewithsouma.stack.Expression;
import com.codewithsouma.stack.Stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.add(10);
        stack.add(20);
        stack.add(30);
        System.out.println(stack.length());
        stack.pop();
        stack.pop();
//        stack.pop();
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.length());



    }
}
