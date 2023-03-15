public class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        if (x == 0) {
            return 0;
        } else if (x < 0) {
            return -1;
        }
        
        // 有可能接近x的數字平方會overflow, 改用long
        // 999999999
        // Integer.MAX_VALUE = 2147483647
        long start = 1, end = x;
        while (start + 1 < end) {
            long mid = start + (end - start) / 2;
            if (mid * mid < x) {
                start = mid;
            } else {
                end = mid;
            } 
        }

        if (end * end <= x) {
            return (int)end;
        } else {
            return (int)start;
        }
    }
}