public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if (matrix == null || matrix[0] == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        // Find the row index
        int rowIdx;
        int m = matrix.length, n = matrix[0].length;
        int start = 0, end = m - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (target >= matrix[mid][n - 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }

        // Becareful about this smaller or 'equal' to
        if (target <= matrix[start][n - 1]) {
            rowIdx = start;
        } else {
            rowIdx = end;
        }

        int left = 0, right = n - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (target >= matrix[rowIdx][mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (matrix[rowIdx][left] == target || matrix[rowIdx][right] == target) {
            return true;
        }
        return false;
    }
}