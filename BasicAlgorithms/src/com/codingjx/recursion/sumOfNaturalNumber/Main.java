package com.codingjx.recursion.sumOfNaturalNumber;

/**
 * Given a natural number, sum up all the natural number <= n
 * (ex) n = 2,
 * ans: 1 + 2 = 3
 *
 * (ex) n = 4,
 * ans: 1 + 2 + 3 + 4 = 10
 */
public class Main {
    public static void main(String[] args) {
        int n = 4;
        System.out.println("sumOfNaturalNum(" + n + ") = " + sumOfNaturalNum(n));
    }

    static int sumOfNaturalNum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfNaturalNum(n - 1);
        }
    }
}

/**
 * Time: O(n)
 * Space: O(n)
 */