package com.jiban.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = { -3, -1, 0, 0, 0, 3, 3 };
        int len = removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i]);
        }
    }

    private static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> numMap = new LinkedHashMap();
        for (int num : nums) {
            if (!numMap.containsKey(num)) {
                numMap.put(num, 1);
            }
        }

        int i = 0;
        for (int num : numMap.keySet()) {
            nums[i++] = num;
        }

        return numMap.size();
    }

}
