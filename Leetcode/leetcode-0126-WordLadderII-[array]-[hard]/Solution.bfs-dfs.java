class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        Set<String> dictionary = new HashSet<>(wordList);
        dictionary.remove(beginWord); // Corner Case: 有可能beginWord會出現在wordList中, (ex) In one of the test case, beginWord: "a", endWord: "c", wordList: ["a","b","c"]

        if (!dictionary.contains(endWord)) {
            return result;
        }
        
        Map<String, List<String>> map = new HashMap<>();
        drawMap(beginWord, endWord, dictionary, map);
        System.out.println("map " + map);
        
        List<String> path = new ArrayList<String>();
        path.add(beginWord);
        generatePaths(beginWord, endWord, map, result, path);
        
        return result;
    }
    
    public void drawMap(String beginWord, String endWord, Set<String> dictionary, Map<String, List<String>> map) {
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
 
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean endWordAtThisLevel = false; // Corner Case: 利用這個來判斷可不可以不用在處理往後的case
            Set<String> visitedAtThisLevel = new HashSet<>(); // Corner Case: 當前這層我們遇到的這個點, 不能遍歷第一次後就把它刪掉, 因為有可能其他點也可以到達當前點, 刪掉的話其他點就到不了了, 所以要遍歷完這層再刪掉
            
            for (int i = 0; i < size; i++) {
                String curStr = queue.poll();
                if (curStr.equals(endWord)) {
                    continue;
                }
                
                StringBuilder sb = new StringBuilder(curStr);
                map.put(curStr, new ArrayList<>());
                
                for (int j = 0; j < curStr.length(); j++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        sb.setCharAt(j, c);
                        if (dictionary.contains(sb.toString())) {
                            queue.offer(sb.toString());
                            map.get(curStr).add(sb.toString());
                            // dictionary.remove(sb.toString()); <- This is not correct
                            visitedAtThisLevel.add(sb.toString());
                        }
                        
                        if (sb.toString().equals(endWord)) { // Corner Case: 當遇到endWord時, 需要特殊處理讓下一個可能path也能到達endWord
                            endWordAtThisLevel = true;
                            // dictionary.add(endWord); <- This is not correct
                        }
                    }
                    sb.setCharAt(j, curStr.charAt(j));
                }
            }
            
            dictionary.removeAll(visitedAtThisLevel);
            
            if (endWordAtThisLevel) {
                return;
            }
        }
    }
    
    public void generatePaths(String beginWord, String endWord, Map<String, List<String>> map, List<List<String>> result, List<String> path) {
        if (beginWord.equals(endWord)) {
            result.add(new ArrayList<String>(path));
            return;
        }
        
        List<String> availables = map.get(beginWord);
        if (availables == null || availables.size() == 0) {
            return;
        } 
        
        for (int i = 0; i < availables.size(); i++) {
            path.add(availables.get(i));
            generatePaths(availables.get(i), endWord, map, result, path);
            path.remove(path.size() - 1);
        }
    }
}