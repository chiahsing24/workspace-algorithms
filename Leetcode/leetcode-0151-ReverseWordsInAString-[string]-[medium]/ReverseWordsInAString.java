class Solution {
    public String reverseWords(String s) {
        int i = 0;
        int j = i + 1;
        int size = s.length();
        StringBuilder sb = new StringBuilder();
        while (i < size) {
            if (s.charAt(i) == ' ') {
                i++;
            } else {
                j = i + 1;
                while (j < size && s.charAt(j) != ' ') {
                    j++;
                }
                String temp = s.substring(i, j);
                sb.insert(0, " ");
                sb.insert(0, temp);
                i = j;
            }
        }
        return sb.toString().trim();
    }
}