package com.jiban.algorithms;

import java.util.Arrays;

public class CountNegativeNumbers {

    public static void main(String[] args) {
        int[][] grid = { { 4, 3, 2, -1 }, { 3, 2, 1, -1 }, { 1, 1, -1, -2 }, { -1, -1, -2, -3 } };
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int count = 0;
        for(int [] nums : grid) {
            count+=Arrays.stream(nums).filter(i -> i<0).count();
        }
        return count;
    }
}
