class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int endWordIdx = -1;
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(endWord)) {
                endWordIdx = i;
            }
        }
        
        if (endWordIdx == -1) {
            return 0;
        }
        

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        visited.add(beginWord);
        wordList = removeVisitedWord(wordList, beginWord);
        int step = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            step++;
            
            for (int i = 0; i < size; i++) {
                String curWord = queue.poll();
                if (curWord.equals(endWord)) {
                    return step;
                }
                    
                List<String> nextAvailables = findNextAvailables(wordList, visited, curWord);
                System.out.println("nextAvailables: " + nextAvailables.toString());
                for (int j = 0; j < nextAvailables.size(); j++) {
                    System.out.println("Selected next string: " + nextAvailables.get(j));
                    queue.offer(nextAvailables.get(j));
                    visited.add(nextAvailables.get(j));
                }
            }
        }
        
        return 0;
    }
    
    public List<String> findNextAvailables(List<String> wordList, Set<String> visited, String curWord) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < wordList.size(); i++) {
            String tempWord = wordList.get(i);
            if (visited.contains(tempWord)) {
                continue;
            }
            
            int diffCnt = 0;
            for (int j = 0; j < tempWord.length(); j++) {
                if (tempWord.charAt(j) != curWord.charAt(j)) {
                    diffCnt++;
                }
            }
            
            if (diffCnt == 1) {
                result.add(tempWord);
            }
        }
        
        return result;
    }
    
    public List<String> removeVisitedWord(List<String> wordList, String curWord) {
        for (int i = 0; i < wordList.size(); i++) {
            if (wordList.get(i).equals(curWord)) {
                wordList.remove(i);
            }
        }
        return new ArrayList<>(wordList);
    }
}