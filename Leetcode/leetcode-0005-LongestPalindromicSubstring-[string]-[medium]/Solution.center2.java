class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String oddLongest = expandFromCenter(s, i, i);
            if (oddLongest.length() > longest.length()) {
                longest = oddLongest;
            }
            
            String evenLongest = expandFromCenter(s, i, i + 1);
            if (evenLongest.length() > longest.length()) {
                longest = evenLongest;
            }
        }
        
        return longest;
    }
    
    public String expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) {
                break;
            }
            
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }
}