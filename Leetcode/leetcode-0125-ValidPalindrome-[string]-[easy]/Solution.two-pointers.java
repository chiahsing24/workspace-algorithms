class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < right && !isValid(s.charAt(left))) {
                left++;
            }
            
            while (left < right && !isValid(s.charAt(right))) {
                right--;
            }
            
            if (left >= right) {
                return true;
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        
        return true;
    }
    
    public boolean isValid(char c) {
        return Character.isLetterOrDigit(c);
    }
}