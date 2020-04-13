package com.jiban.algorithms;

public class NumberStepsReduceZero {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }

    public static int numberOfSteps(int num) {
        int count = 0;
        while(num != 0) {
            if(num % 2 == 0) {
                num = num/2;
                count++;
            } else {
                num--;
                count++;
            }
        }
        return count;
    }

}
