class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = "";
        if (strs == null || strs.length == 0) {
            return longest;
        }
        
        int index = 0;
        for (char c : strs[0].toCharArray()) {
            for (int i = 1; i < strs.length; i++) {
                if (index >= strs[i].length() || c != strs[i].charAt(index)) {
                    return longest;
                }
            }
            longest += c;
            index++;
        }
        
        return longest;
    }
}

/**
 * Complexity Analysis
 * Time complexity: O(m * n), where n is how many strings contains in strs array.
 * Space complexity: O(1)
 * 
 * Time complexity : O(S) , where S is the sum of all characters in all strings. 
 * In the worst case there will be n equal strings with length m and the algorithm performs S = m ⋅ n character comparisons. 
 * Even though the worst case is still the same as Approach 1, in the best case there are at most n ⋅ minLen comparisons 
 * where minLen is the length of the shortest string in the array.
 * Space complexity : O(1). We only used constant extra space.
 */