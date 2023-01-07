class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int left = 0;
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) != ' ' ) {
                i++;
            }

            int right = i - 1;
            while (right >= left) {
                sb.append(s.charAt(right));
                right--;
            }

            i++;
            left = i;
            sb.append(' ');
        }

        return sb.toString().trim();
    }
}