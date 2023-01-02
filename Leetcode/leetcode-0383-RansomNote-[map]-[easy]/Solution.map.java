/**
 *  Time: O(m)
 *  Space: O(k)
 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        HashMap<Character, Integer> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(magazine.charAt(i), magazineMap.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        HashMap<Character, Integer> ransomNoteMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            if (magazineMap.getOrDefault(ransomNote.charAt(i), 0) <= 0) {
                return false;
            }

            magazineMap.put(ransomNote.charAt(i), magazineMap.getOrDefault(ransomNote.charAt(i), 0) - 1);
        }

        return true;
    }
}