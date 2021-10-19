package com.codingjx.recursion.fibonacciNumber;

/**
 * N-th Fibonacci Number where n >= 0
 * 0, 1, 1, 2, 3, 5, 8, 13
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("The ans for fibonacci(" + n + ") is " + fibonacci(n));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
