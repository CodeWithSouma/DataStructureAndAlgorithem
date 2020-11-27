package com.codewithsouma.stack;

import java.util.Stack;

public class BalanceExpression {
    private static Stack<Character> stack;

    public static boolean testExpression(String expression) {
        stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '<' || ch == '(')
                stack.push(ch);
            else if (ch == '}' || ch == ']' || ch == '>' || ch == ')') {
                if (!balanced(ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean balanced(char ch) {
        if (stack.isEmpty()) return false;

        switch (ch) {
            case '}':
                return stack.pop() == '{';
            case ']':
                return stack.pop() == '[';
            case ')':
                return stack.pop() == '(';
            case '>' :
                return stack.pop() == '<';
            default: return false;
        }
    }


}
