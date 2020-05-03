package com.jiban.algorithms;

import java.util.LinkedList;
import java.util.List;

public class TargetArray {

    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4};
        int [] index = {0,1,2,2,1};
        int [] result = createTargetArray(nums, index);
        for(int n : result) {
            System.out.print(n);
        }
    }
    
    public static int[] createTargetArray(int[] nums, int[] index) {
        int [] result = new int[nums.length];
        List<Integer> resultList = new LinkedList<Integer>();
        for(int i = 0; i< nums.length; i++) {
            int position = index[i];
            resultList.add(position, nums[i]);
        }
        for(int i = 0; i <resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
