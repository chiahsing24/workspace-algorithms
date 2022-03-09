class Solution {
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) { // Find first not match
                break;
            }            
            start++;
            end--;
        }
        
        if (start >= end) return true;
        
        return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
    }
    
    private boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}