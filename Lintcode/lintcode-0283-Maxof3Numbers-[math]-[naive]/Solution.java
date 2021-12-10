public class Solution {
    /**
     * @param num1: An integer
     * @param num2: An integer
     * @param num3: An integer
     * @return: an interger
     */
    public int maxOfThreeNumbers(int num1, int num2, int num3) {
        // write your code here
        int temp = Math.max(num1, num2);
        int res = Math.max(temp, num3);
        return res;
    }
}