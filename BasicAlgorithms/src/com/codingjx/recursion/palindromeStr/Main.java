package com.codingjx.recursion.palindromeStr;

/**
 * Palindrome string checking using recursion
 * (ex): "abbcbba"
 */
public class Main {
    public static void main(String[] args) {
        String[] strs = new String[] {"abcdcba", "abcddcba", "agcddcba"};

        for (int i = 0; i < 3; i++) {
            System.out.println("isPalindrome(str" + (i + 1) + ") = " + isPalindrome(strs[i], 0, strs[i].length() - 1));
        }
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }

        return (str.charAt(start) == str.charAt(end)) && isPalindrome(str, start + 1, end - 1);
    }
}
