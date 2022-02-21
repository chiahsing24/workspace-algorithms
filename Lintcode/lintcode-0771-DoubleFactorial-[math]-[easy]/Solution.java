public class Solution {
    /**
     * @param n: the given number
     * @return:  the double factorial of the number
     */
    public long doubleFactorial(int n) {
        // Write your code here
        if (n == 2) {
            return 2;
        } 

        if (n == 1) {
            return 1;
        }

        return n * doubleFactorial(n - 2);
    }
}