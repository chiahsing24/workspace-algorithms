public class Solution {
    /**
     * @param a: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] a) {
        // write your code here
        int start = 0, end = a.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (a[mid - 1] < a[mid]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        if (a[start] < a[end]) {
            return end;
        }

        return start;
    }
}