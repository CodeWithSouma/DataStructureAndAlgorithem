package com.codewithsouma;

import com.codewithsouma.array.MaxMinElement;
import com.codewithsouma.array.ReverseArray;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        int[] numbers = {40};
        System.out.println(Arrays.toString(new ReverseArray().reverse(numbers)));
        MaxMinElement maxMinElement = new MaxMinElement();
        maxMinElement.PrintMaximumAndMinimum(numbers);


    }
}
