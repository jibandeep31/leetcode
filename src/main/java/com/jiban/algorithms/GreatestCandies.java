package com.jiban.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        System.out.println(greatestCandies(candies, extraCandies));
    }

    public static List<Boolean> greatestCandies(int[] candies, int extraCandies) {
        int maxCandy = Arrays.stream(candies).max().getAsInt();
        Function<Integer, Boolean> isGreatest = (candy) -> {
            if ((candy + extraCandies) >= maxCandy) {
                return Boolean.TRUE;
            } else {
                return Boolean.FALSE;
            }
        };
        return Arrays.stream(candies).boxed().map(isGreatest).collect(Collectors.toList());
    }

}
