class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLength = 0;
        int[] diff = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int[] prefixDiff = new int[s.length()];
        prefixDiff[0] = diff[0];
        for (int i = 1; i < s.length(); i++) {
            prefixDiff[i] = prefixDiff[i - 1] + diff[i];
        }

        int left = 0, right = 0;
        while (right < s.length() && left < s.length()) {
            if (prefixDiff[right] - prefixDiff[left] + diff[left] <= maxCost) {
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                left++;
            }
        }

        return maxLength;
    }
}