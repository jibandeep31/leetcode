package com.jiban.algorithms;

public class Maximum69Number {

    public static void main(String[] args) {
        System.out.println(maximum69Number(9996));
    }

    public static int maximum69Number(int num) {
        char[] nums = Integer.valueOf(num).toString().toCharArray();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == '6') {
                nums[i] = '9';
                break;
            }
        }
        return Integer.valueOf(new String(nums));
    }
}
