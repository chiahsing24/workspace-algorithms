package com.codingjx.recursion.sumOfDigits;

/**
 * Write a recursion function to find the sum of digits in a number
 * (ex) n = 253
 * ans = 2 + 5 + 3 = 10
 */
public class Main {
    public static void main(String[] args) {
        int n1 = 253;
        int n2 = 9987;
        System.out.println("The sum of digits of n1 = " + sumOfDigits(n1));
        System.out.println("The sum of digits of n2 = " + sumOfDigits(n2));
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int next = n / 10;
        return (n % 10) + sumOfDigits(next);
    }
}
