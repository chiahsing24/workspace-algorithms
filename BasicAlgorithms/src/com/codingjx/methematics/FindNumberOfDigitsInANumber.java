package com.codingjx.methematics;

public class FindNumberOfDigitsInANumber {
    public static void main(String[] args) {
        // Finding number of digits in a number
        long num = 9876543l;
        System.out.println(countDigits(num));
        System.out.println(countDigitsRecursive(num));
    }

    // Iterative Solution
    public static int countDigits(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    // Recursive Solution
    public static int countDigitsRecursive(long n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigitsRecursive(n / 10);
    }
}
