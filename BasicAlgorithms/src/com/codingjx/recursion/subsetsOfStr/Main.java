package com.codingjx.recursion.subsetsOfStr;

import java.util.List;

/**
 * Given a string, print all subsets of it (in any order).
 * str = "ABC"
 * ans = "", "A", "B", "C", "AB", "AC", "BC", "ABC"
 */
public class Main {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Subsets of str(ABC): ");
        subsetsOfStr(str, "", 0);
    }

    public static void subsetsOfStr(String str, String cur, int index) {
        if (index == str.length()) {
            System.out.println(" " + cur + " ");
            return;
        }

        subsetsOfStr(str, cur, index + 1);
        subsetsOfStr(str, cur + str.charAt(index), index + 1);
    }
}
/**
 *                          cur = ""                     index = 0
 *                      /               \
 *                     /                 \
 *                    ""                 "A"             index = 1
 *                   /  \             /      \
 *                  /    \           /        \
 *                ""     "B"       "A"        "AB"       index = 2
 *               /  \    /  \      /  \      /  \
 *              /    \  /    \    /    \    /    \
 *            ""   "C" "B"  "BC" "A"  "AC" "AB"  "ABC"   index = 3
 */
