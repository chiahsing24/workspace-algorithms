class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        long xL = x;
        long left = 1;
        long right = xL / 2;
        while (left + 1 < right) {
            long mid = left + (right - left) / 2;
            if (mid * mid > xL) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (right * right <= x) {
            return (int) right;
        }

        return (int) left;
    }
}