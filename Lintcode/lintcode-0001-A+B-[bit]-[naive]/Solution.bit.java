public class Solution {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b 
     */
    public int aplusb(int a, int b) {
        // write your code here
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } 
        int res = (a ^ b);
        int carry = (a & b) << 1;

        // 相當於carry不等於0的話, 繼續運算
        return aplusb(res, carry);
    }
}