class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] lookup = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lookup[s.charAt(i) - 'a'] = lookup[s.charAt(i) - 'a'] + 1;
        }
        
        for (int i = 0; i < t.length(); i++) {
            lookup[t.charAt(i) - 'a'] = lookup[t.charAt(i) - 'a'] - 1;
        }
        
        for (int i = 0; i < lookup.length; i++) {
            if (lookup[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
}