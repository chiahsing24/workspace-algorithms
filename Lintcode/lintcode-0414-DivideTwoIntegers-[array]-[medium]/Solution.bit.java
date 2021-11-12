public class Solution {
    /**
     * @param dividend: the dividend
     * @param divisor: the divisor
     * @return: the result
     */
    public int divide(int dividend, int divisor) {
        // write your code here
        // MIN_VALUE = -2147483648
        // MAX_VALUE =  2147483647 
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int res = 0;

        while (a - b >= 0) {
            int x = 0;
            while (a - (b << 1 << x) >= 0) {
                x++;
            }

            res += 1 << x;
            a -= (b << x);
        }

        // 同時考慮了雙負, 雙正情況
        if (dividend >= 0 == divisor >= 0) {
            return res;
        }
        return -1 * res;
    }
}