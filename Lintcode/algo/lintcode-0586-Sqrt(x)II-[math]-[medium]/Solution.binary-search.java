public class Solution {
    /**
     * @param x: a double
     * @return: the square root of x
     */
    public double sqrt(double x) {
        // write your code here
        double start = 0, end = x;

        // handle corner case:
        // (ex1) 0.1 = 0.03 * 0.03
        // (ex1) 0.04 = 0.2 * 0.2
        if (x < 1) {
            end = 1;
        }

        while (start + 1e-12 < end) {
            double mid = start + (end - start) / 2;
            System.out.println("mid: " + mid);
            if (mid * mid >= x) {
                end = mid;
            } else {
                start = mid;
            }
        }
        // return start or end should be the same
        return start;
    }
}