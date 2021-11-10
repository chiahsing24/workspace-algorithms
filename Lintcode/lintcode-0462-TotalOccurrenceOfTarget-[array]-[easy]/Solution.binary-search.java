public class Solution {
    /**
     * @param A: A an integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int totalOccurrence(int[] A, int target) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }


        int firstIdx = -1, secondIdx = -1;
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        int left = 0, right = A.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (A[start] == target) {
            firstIdx = start;
        } else if (A[end] == target) {
            firstIdx = end;
        } 

        if (A[right] == target) {
            secondIdx = right;
        } else if (A[left] == target) {
            secondIdx = left;
        }

        return firstIdx > -1 ? secondIdx - firstIdx + 1 : 0;
    }
}