class Solution {
    public int[] countBits(int n) {
        // 0    0   0
        // 1    1   1
        // 2   10   1
        // 3   11   2
        // 4  100   1
        // 5  101   2
        // 6  110   2
        // 7  111   3
        // 8 1000   1
        int[] ans = new int[n + 1];
        ans[0] = 0;
        
        if (n > 0) {
            ans[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            ans[i] = ans[i / 2] + ans[i % 2];
        }
        
        return ans;
    }
}