package com.jiban.algorithms;

import java.util.Arrays;

public class EvenNumberDigits {

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        long result = Arrays.stream(nums).boxed().map(num -> num.toString())
                .filter(numString -> numString.length() % 2 == 0).count();
        return (int) result;
    }
}
