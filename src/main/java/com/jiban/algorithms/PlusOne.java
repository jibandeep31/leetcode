package com.jiban.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.event.ListSelectionEvent;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits = { 1, 7, 9 };
        int[] result = plusOne(digits);
        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] plusOne(int[] digits) {
        final StringBuilder numberStringBuilder = new StringBuilder();
        Arrays.stream(digits).boxed().forEach(numberStringBuilder::append);
        Integer value = Integer.valueOf(numberStringBuilder.toString());
        value++;
        System.out.println(value);
        List<Integer> numList = new ArrayList<Integer>();
        while (value > 0) {
            numList.add(value % 10);
            value = value / 10;
        }
        Collections.reverse(numList);
        return numList.stream().mapToInt(i -> i).toArray();
    }

}
