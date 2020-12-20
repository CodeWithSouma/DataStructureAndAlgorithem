package com.codewithsouma.recursion;

public class Recursion {
    public static void show(){
        int number = 4;
        System.out.println("Factorial of "+number+": "+factorial(number));
    }

    private static int factorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial = factorial * i;
        return factorial;
    }
}
