class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return isUniDirectionalIsomorphic(s, t) && isUniDirectionalIsomorphic(t, s);
    }

    public boolean isUniDirectionalIsomorphic(String s, String t) {
        HashMap<Character, Character> lookup = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!lookup.containsKey(s.charAt(i))) {
                lookup.put(s.charAt(i), t.charAt(i));
            } else if (lookup.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}