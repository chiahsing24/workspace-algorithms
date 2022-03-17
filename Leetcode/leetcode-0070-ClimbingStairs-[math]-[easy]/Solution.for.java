class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int[] result = new int[2];
        result[0] = 1;
        result[1] = 2;
        for (int i = 3; i <= n; i++) {
            int temp = result[0] + result[1];
            result[0] = result[1];
            result[1] = temp;
        }
        
        return result[1];
    }
}