package com.jiban.algorithms;

public class LowerCase {

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }

    public static String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character character = new Character(chars[i]);
            chars[i] = Character.toLowerCase(character);
        }
        return new String(chars);
    }

}
