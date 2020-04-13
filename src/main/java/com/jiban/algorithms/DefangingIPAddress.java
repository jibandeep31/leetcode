package com.jiban.algorithms;

public class DefangingIPAddress {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }

        }
        return sb.toString();
    }

}
