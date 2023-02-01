class Solution {
    public int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }

        int i = 1;
        while (i <= x / i) {
            i++;
        }

        if (i <= x / i) {
            return i;
        } else {
            return i - 1;
        }
    }
}