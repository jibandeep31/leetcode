package com.jiban.algorithms;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int len = removeElement(nums, val);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    private static int removeElement(int[] nums, int val) {
        List<Integer> numList = new ArrayList();
        for (int n : nums) {
            if (n != val) {
                numList.add(n);
            }
        }
        int i = 0;
        for (int n : numList) {
            nums[i++] = n;
        }
        return numList.size();
    }
}
