package com.jiban.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DecompressRLEList {

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3 };
        int[] result = decompressRLElist(nums);
        for (int n : result) {
            System.out.print(n);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            int freq = nums[i++];
            int value = nums[i];
            List<Integer> streamList = Stream.generate(() -> {
                return value;
            }).limit(freq).collect(Collectors.toList());
            numList.addAll(streamList);
        }
        int[] result = new int[numList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = numList.get(i);
        }
        return result;
    }
}