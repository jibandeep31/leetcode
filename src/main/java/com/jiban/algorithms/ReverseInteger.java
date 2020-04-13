package com.jiban.algorithms;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseInteger {

    private static final Logger Log = Logger.getLogger(ReverseInteger.class.getName());

    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        Log.log(Level.INFO, "The reverse is : {0}", reverse);
    }

    public static int reverse(int x) {
        int minusFlag = 1;
        int reverse = 0;
        if (x < 0) {
            minusFlag = -1;
        }
        try {
            String number = String.valueOf(x * minusFlag);
            StringBuilder s = new StringBuilder(number);
            reverse = Integer.parseInt(s.reverse().toString());
        } catch (Exception e) {
            return 0;
        }
        return reverse * minusFlag;
    }

}
