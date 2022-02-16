class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m == 0 && n == 0 || m == 0) return true;
        if (m > n) return false;
        
        int sPtr = 0;
        int tPtr = 0;
        while (sPtr < m && tPtr < n) {
            if (s.charAt(sPtr) == t.charAt(tPtr)) {
                sPtr++;
            }
            tPtr++;
        }
        
        return sPtr == m;
    } 
}