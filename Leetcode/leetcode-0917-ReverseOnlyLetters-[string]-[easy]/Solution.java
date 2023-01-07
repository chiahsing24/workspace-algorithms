class Solution {
    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < s.length() && left < right && !Character.isAlphabetic(chars[left])) {
                left++;
            }

            while (right >= 0 && left < right && !Character.isAlphabetic(chars[right])) {
                right--;
            }

            if (left < s.length() && right >= 0 && left < right && Character.isAlphabetic(chars[left]) && Character.isAlphabetic(chars[right])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return String.copyValueOf(chars);
    }
}