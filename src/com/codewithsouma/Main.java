package com.codewithsouma;

import com.codewithsouma.array.ReverseArray;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        int[] numbers = {10,20,30};
        System.out.println(reverseArray.reverse("Souma"));
        System.out.println(Arrays.toString(reverseArray.reverse(numbers)));

    }
}
