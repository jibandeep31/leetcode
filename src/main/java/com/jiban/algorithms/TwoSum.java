package com.jiban.algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TwoSum {
    
    private static final Logger Log = Logger.getLogger(TwoSum.class.getName());

    public static void main(String[] args) {

        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int [] results = twoSum(nums, target);
        Arrays.stream(results).forEach(result -> Log.log(Level.INFO, "The value is : {0}", result));
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int integer = nums[i];
            if (numMap.containsKey(target - integer) && numMap.get(target - integer) != i) {
                return new int[] { i, numMap.get(target - integer) };
            }
        }

        return null;
    }

}
