class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int temp = x;
        int res = 0;
        while (x > 0) {
            res = res * 10 + (x % 10);
            x = x / 10;
        }
        
        return res == temp;
    }
}

// Time complexity: $$\log_{10} n$$
// Space complexity: O(1)