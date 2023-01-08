class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int curVowelCnt = 0;
        for (int i = 0; i < k; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                curVowelCnt++;
            }
        }

        max = Math.max(max, curVowelCnt);

        if (max == k) {
            return k;
        }

        for (int i = k; i < s.length(); i++) {
            int left = i - k;
            if (s.charAt(left) == 'a' || s.charAt(left) == 'e' || s.charAt(left) == 'i' || s.charAt(left) == 'o' || s.charAt(left) == 'u') {
                curVowelCnt--;
            }

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                curVowelCnt++;
            }
            
            max = Math.max(max, curVowelCnt);
        }

        return max;
    }
}