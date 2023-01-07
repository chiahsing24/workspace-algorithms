class Solution {
    public String reversePrefix(String word, char ch) {
        char[] chars = word.toCharArray();

        int start = 0, end = 0, found = 0;
        while (end < word.length()) {
            if (chars[end] != ch) {
                end++;
            } else {
                if (found == 0) {
                    found = 1;
                    int nextEnd = end;
                    while (start < end) {
                        char temp = chars[end]; 
                        chars[end] = chars[start];
                        chars[start] = temp;
                        start++;
                        end--;
                    }

                    end = nextEnd;
                } 
                end++;
            }
        }

        return String.valueOf(chars);
    }
}