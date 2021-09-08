class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        
        int size = matrix.length * matrix[0].length;
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        while (result.size() < size) {
            for (int i = left; i <= right && result.size() < size; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            for (int i = top; i <= bottom && result.size() < size; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            for (int i = right; i >= left && result.size() < size; i--) {
                result.add(matrix[bottom][i]);
            }
            bottom--;
            
            for (int i = bottom; i >= top && result.size() < size; i--) {
                result.add(matrix[i][left]);
            }    
            left++;
        }
        
        return result;
    }
}

/**
 * Complexity Analysis
 * Time complexity: O(M * N)
 * Space complexity: O(n)
 */