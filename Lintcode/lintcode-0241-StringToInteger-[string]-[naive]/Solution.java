public class Solution {
    /**
     * @param target: A string
     * @return: An integer
     */
    public int stringToInteger(String target) {
        // write your code here
        int isNegative = 0;
        if (target.charAt(0) == '-') {
            isNegative = 1;
        }

        int result = 0;
        for (int i = isNegative; i < target.length(); i++) {
            result = result * 10 + (target.charAt(i) - '0');
        }

        return isNegative == 1 ? -1 * result : result;
    }
}