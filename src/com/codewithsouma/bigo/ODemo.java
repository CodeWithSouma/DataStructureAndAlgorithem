package com.codewithsouma.bigo;

public class ODemo {
    public static void log(int[] numbers, String[] names){
        // O(1) --> Not depend on input
        System.out.println(numbers[0]);// it run constant time
        System.out.println(numbers[0]);// it run constant time

        // O(n + n) = O(2n) = O(n)
        //O(n + m) = O(n)
        for (int i = 0; i <numbers.length ; i++) // O(n)
            System.out.println(numbers[i]);

        for (int i = 0; i <numbers.length ; i++) // O(n)
            System.out.println(numbers[i]);

        for (String name : names) // O(m)
            System.out.println(name);
    }

    public static void log2(int[] numbers){
        // O(n^2)
        for (int first : numbers)//O(n)
            for (int second : numbers)//O(n)
                System.out.println(first+ ", "+second);
    }

    public static void  greet(String [] names){
        Integer [] numbers = new Integer[names.length];//space complexity O(n)

        // space complexity o(1)
        for(int i = 0; i <= names.length; i++)// time complexity o(n)
            System.out.println(names);
    }


}
