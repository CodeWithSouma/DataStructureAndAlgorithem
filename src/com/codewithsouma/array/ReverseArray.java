package com.codewithsouma.array;

import java.util.Arrays;

public class ReverseArray {

    // works for sorted array
    public int[] reverse(int[] array) {
        if (array.length == 0) return  array;
        Arrays.sort(array);
       int start = 0;
       int end = array.length - 1;
        while (start < end ){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }

    public String reverse(String string){
        return new StringBuilder(string).reverse().toString();
    }

}
