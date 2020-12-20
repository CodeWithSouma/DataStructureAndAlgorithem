package com.codewithsouma.recursion;

public class Recursion {
    public static void show(){
        int number = 4;
        System.out.println("Factorial of "+number+": "+factorial(number));
    }

    private static int factorial(int number){
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }
}
