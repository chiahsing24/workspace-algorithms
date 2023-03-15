public class Solution {
    /**
     * @param A: an integer array sorted in ascending order
     * @param target: An integer
     * @return: an integer
     */
    public int closestNumber(int[] A, int target) {
        // write your code here
        if (A.length == 0) {
            return -1;
        }

        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (target == A[mid]) {
                return mid;
            } else if (target > A[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (Math.abs(target - A[start]) < Math.abs(target - A[end])) {
            return start;
        } 
        return end;
    }
}