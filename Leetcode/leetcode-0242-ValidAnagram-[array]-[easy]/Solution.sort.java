class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        String sSorted = String.valueOf(sChars);
        
        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);
        String tSorted = String.valueOf(tChars);
        
        return sSorted.equals(tSorted);
    }
}