package com.jiban.algorithms;

import java.util.Arrays;

public class SearchInsertPosition {
    
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};        
        System.out.println(searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {
        return (int) Arrays
                        .stream(nums)
                        .filter(i -> i < target)
                        .count();
    }
}
