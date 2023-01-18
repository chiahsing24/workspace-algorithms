class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        
        int longest = 0;
        int i = 0, j = 0;
        while (i < s.length() && j < s.length()) {
            if (freq.getOrDefault(s.charAt(j), 0) == 0) {
                longest = Math.max(longest, j - i + 1);
            } else {
                while (s.charAt(i) != s.charAt(j)) {
                    freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) - 1);
                    i++;
                }
                
                freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) - 1);
                i++;
            }
            freq.put(s.charAt(j), 1);
            j++;
        }
        
        return longest;
    }
}
