package com.codewithsouma.stack;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input){
        if (input == null) throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuilder reverse = new StringBuilder();
        while (!stack.empty())
            reverse.append(stack.pop());

        return reverse.toString();
    }
}
