package com.jiban.algorithms;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("{[]}"));
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[' || c == '{' || c == '(') {
                stack.push(c);
                System.out.println("Pushed symbol in stack : " + c);
            } else {
                if (c == ')' || c == '}' || c == ']') {
                    if (stack.isEmpty())
                        return false;
                }
                char peekChar = stack.peek();
                if (peekChar == '[' && c == ']') {
                    stack.pop();
                    System.out.println("Poped symbol in stack : " + c);
                } else if (peekChar == '{' && c == '}') {
                    stack.pop();
                    System.out.println("Poped symbol in stack : " + c);
                } else if (peekChar == '(' && c == ')') {
                    stack.pop();
                    System.out.println("Poped symbol in stack : " + c);
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
