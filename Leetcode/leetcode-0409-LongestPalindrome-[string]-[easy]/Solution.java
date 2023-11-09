class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        int length = 0;
        boolean hasSingleCharacter = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int cnt = entry.getValue();
            if (cnt % 2 == 0) {
                length += cnt;
            } else {
               hasSingleCharacter = true; 
               if (cnt > 2) {
                   length += (cnt - 1);
               }
            }
        } 

        return hasSingleCharacter ? length + 1 : length; 
    }
}