public class Solution {
    public char getIndexOne(String str) {
        return str.charAt(1);
    }
}

class Solution2 {
    public char getIndexOne(String str) {
        char[] chars = str.toCharArray();
        return chars[1];
    }
}