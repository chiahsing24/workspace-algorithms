public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int[] result = {-1, -1};
        if (A == null || A.length == 0) {
            return result;
        }

        int first = -1;
        int start = 0, end = A.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (A[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }

        if (A[start] == target) {
            first = start;
        } else if (A[end] == target) {
            first = end;
        }

        int second = -1;
        int left = 0, right = A.length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (A[mid] > target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (A[right] == target) {
            second = right;
        } else if (A[left] == target) {
            second = left;
        }

        if (left == -1 || right == -1) {
            return result;
        } else {
            result[0] = first;
            result[1] = second;
            return result;
        }
    }
}