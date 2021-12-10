public class Solution {
    /**
     * @param r: a Integer represent radius
     * @return: the circle's circumference nums[0] and area nums[1]
     */
    public double[] calculate(int r) {
        // write your code here
        double circumference = 3.14 * 2 * r;
        double area = 3.14 * Math.pow(r, 2);
        double[] ans = new double[2];
        ans[0] = circumference;
        ans[1] = area;
        return ans;
    }
}