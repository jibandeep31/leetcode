package com.jiban.algorithms;

public class SubtractProductDifference {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(4421));
    }

    public static int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n > 0) {
            int temp = n % 10;
            n = n/10;
            sum = sum + temp;
            product = product * temp;
        }
        
        return product - sum;
    }

}
