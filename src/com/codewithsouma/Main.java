package com.codewithsouma;


import com.codewithsouma.stack.Expression;

public class Main {

    public static void main(String[] args) {
        String str = "<[(1+2)]>";
        Expression expression = new Expression();
        boolean  result = expression.isBalanced(str);
        System.out.println(result);
    }
}
