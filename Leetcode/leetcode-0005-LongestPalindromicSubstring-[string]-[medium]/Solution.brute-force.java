class Solution {
    public String longestPalindrome(String s) {
        if (s == null) return null;
        
        String result = "";
        for (int length = s.length(); length > 0; length--) {
            for (int start = 0; start <= s.length() - length; start++) {
                if (isPalindrome(s, start, start + length - 1)) {
                    if (length > result.length()) {
                        result = s.substring(start, start + length);
                        System.out.println(result);
                    }
                }
            }
        }
        return result;
    }
    
    public boolean isPalindrome(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}