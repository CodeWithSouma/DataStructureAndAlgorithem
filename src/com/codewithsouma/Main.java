package com.codewithsouma;


import com.codewithsouma.stack.StringReverser;

import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "abcd";
        StringReverser reverser = new StringReverser();
        System.out.println(reverser.reverse(str));

    }
}
