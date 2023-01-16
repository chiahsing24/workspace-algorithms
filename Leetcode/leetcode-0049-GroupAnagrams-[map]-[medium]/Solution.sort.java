/**
* Time: O(NKlogK), N is the length of the strs, K is the maximum length of a str in strs.
* Space: O(NK)
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            char[] strChars = str.toCharArray();
            Arrays.sort(strChars);
            String key = String.valueOf(strChars);
            
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>(Arrays.asList(str)));
            } else {
                List<String> temp = map.get(key);
                temp.add(str);
                map.put(key, temp);
            }
        }
                        
        for (String key : map.keySet()) {
            ArrayList<String> temp = new ArrayList<>(map.get(key));
            result.add(temp);
        }
                        
        return result;
    }
}