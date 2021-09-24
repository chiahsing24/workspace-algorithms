class Solution {
    public String reverseWords(String s) {
        int i = 0, j = 0, size = s.length();
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
                StringBuilder sbTemp = new StringBuilder(temp);
                sbTemp.reverse();
                
                sb.append(sbTemp);
                sb.append(' ');
                i = j + 1;
            }
        }
        return sb.toString().trim();
    }
}