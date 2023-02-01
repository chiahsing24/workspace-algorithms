class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int left = 1, right = x / 2;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (right <= x / right) {
            return right;
        }

        return left;
    }
}