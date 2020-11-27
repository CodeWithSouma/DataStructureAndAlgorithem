package com.codewithsouma;


import com.codewithsouma.stack.BalanceExpression;

public class Main {

    public static void main(String[] args) {
        String expression = "{";
        boolean result = BalanceExpression.testExpression(expression);
        System.out.println(result);

    }
}
