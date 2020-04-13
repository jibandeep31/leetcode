package com.jiban.algorithms;

public class LengthofLastWord {

    public static void main(String[] args) {
        String words = "a";
        System.out.println(lengthOfLastWord(words));
    }

    private static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length <= 0) {
            return 0;
        }
        String lastWord = words[words.length - 1];
        System.out.println(lastWord);
        return lastWord.length();
    }

}
