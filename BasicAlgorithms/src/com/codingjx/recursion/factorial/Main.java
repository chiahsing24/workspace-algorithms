package com.codingjx.recursion.factorial;

/**
 * Write a function to generate factorial of n
 */
public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("The ans for factorial(" + n +") is " + factorial(n));
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
