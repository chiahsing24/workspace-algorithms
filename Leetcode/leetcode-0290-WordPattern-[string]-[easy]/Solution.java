class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> visited = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!visited.containsKey(pattern.charAt(i))) {
                visited.put(pattern.charAt(i), words[i]);
            } else if (visited.containsKey(pattern.charAt(i)) && !visited.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }
        }

        HashMap<String, Character> reverseVisited = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!reverseVisited.containsKey(words[i])) {
                reverseVisited.put(words[i], pattern.charAt(i));
            } else if (reverseVisited.containsKey(words[i]) && reverseVisited.get(words[i]) != pattern.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}