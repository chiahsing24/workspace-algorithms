class Solution {
    public char repeatedCharacter(String s) {
        char res = ' ';
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                res = ch;
                return ch;
            } 
            set.add(ch);
        }

        return res;
    }
}