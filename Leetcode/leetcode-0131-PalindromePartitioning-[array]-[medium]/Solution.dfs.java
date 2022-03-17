class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        
        List<String> partition = new ArrayList<>();
        find(result, partition, 0, s);
        
        return result;
    }
    
    public boolean isPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    public void find(List<List<String>> result, List<String> partition, int startIndex, String inputStr) {
        if (startIndex == inputStr.length()) {
            result.add(new ArrayList<String>(partition));
            return;
        }
        
        for (int i = startIndex; i < inputStr.length(); i++) {
            String str = inputStr.substring(startIndex, i + 1);
            
            if (!isPalindrome(str)) {
                continue;
            }
            
            partition.add(str);
            find(result, partition, i + 1, inputStr);
            partition.remove(partition.size() - 1);
        }
    }
}