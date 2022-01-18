class Solution {
    public int reverse(int x) {
        if (x == 0) return x;
        
        int res = 0;
        while (x != 0) { // 這裡條件必須是 x != 0, 而不是 x > 0, 因為如果input是負數, 則有可能進不了循環
            int last = (x % 10);
            int tempRes = res * 10 + last;
            if ((tempRes - last) / 10 != res) {
                return 0;
            }
            res = tempRes;
            x /= 10;
        }
        
        return res;
    }
}