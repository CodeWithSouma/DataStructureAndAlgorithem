package com.codewithsouma.array;

public class ReverseArray {

    public int[] reverse(int[] array) {
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
