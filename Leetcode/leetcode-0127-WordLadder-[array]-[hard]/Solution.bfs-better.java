class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> dict = new HashSet<>();
        for (String word : wordList) {
            dict.add(word);
        }
        
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        int level = 0;
        
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            
            for (int i = 0; i < size; i++) {
                String current = queue.poll();
                if (current.equals(endWord)) {
                    return level;
                }
                
                StringBuilder sb = new StringBuilder(current);
                
                for (int j = 0; j < current.length(); j++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == current.charAt(j)) {
                            continue;
                        }
                        
                        sb.setCharAt(j, c);
                        
                        if (dict.contains(sb.toString())) {
                            queue.offer(sb.toString());
                            dict.remove(sb.toString());
                        }
                    }
                    
                    sb.setCharAt(j, current.charAt(j));
                }
            }
        }
        
        return 0;
    }
}