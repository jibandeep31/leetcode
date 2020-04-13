package com.jiban.algorithms;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int x) {
        if (x >= 0) {
            try {
                String reverse = new StringBuilder(Integer.valueOf(x).toString()).reverse().toString();
                if (x == Integer.valueOf(reverse)) {
                    return true;
                } else {
                    return false;
                }
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

}
