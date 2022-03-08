class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return null;
        
        int start = 0, end = 0;
        for (int middle = 0; middle < s.length(); middle++) {
            int len1 = expandFromCenter(s, middle, middle);
            int len2 = expandFromCenter(s, middle, middle + 1);
            int len = Math.max(len1, len2);
            if (len > end - start + 1) {
                start = middle - ((len - 1) / 2);
                end = middle + (len / 2);
            }
        }
        
        return s.substring(start, end + 1);
    }
    
    public int expandFromCenter(String str, int start, int end) {
        while (start >= 0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}