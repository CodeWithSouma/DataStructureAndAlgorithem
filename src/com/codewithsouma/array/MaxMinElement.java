package com.codewithsouma.array;

import java.util.Arrays;

public class MaxMinElement {
    public void PrintMaximumAndMinimum(int[] array){
        if (array.length == 1) {
            System.out.println("Max and min value is same: "+ array[0]);
            return;
        }
        Arrays.sort(array);
        System.out.println("Minimum: "+array[0]);
        System.out.println("Maximum: "+array[array.length - 1]);

    }
}
