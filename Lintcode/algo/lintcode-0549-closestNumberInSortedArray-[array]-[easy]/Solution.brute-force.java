public class Solution {
    /**
     * @param A: an integer array sorted in ascending order
     * @param target: An integer
     * @return: an integer
     */
    public int closestNumber(int[] A, int target) {
        // write your code here
        int diff = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < A.length; i++) {
            int curDiff = Math.abs(A[i] - target);
            if (curDiff < diff) {
                diff = curDiff;
                index = i;
            }
        }
        return index;
    }
}