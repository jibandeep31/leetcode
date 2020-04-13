package com.jiban.algorithms;

import java.util.Arrays;

public class NumbersSmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = smallerNumbersThanCurrent(nums);
        Arrays.stream(result).boxed().forEach(System.out::println);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && i != j) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

}
