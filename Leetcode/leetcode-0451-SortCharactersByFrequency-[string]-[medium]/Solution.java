class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        HashMap<Integer, List<Character>> inverseFreq = new HashMap<>();
        int maxOccurrances = 0;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            char c = entry.getKey();
            int frequency = entry.getValue();
            maxOccurrances = Math.max(maxOccurrances, frequency);
            List<Character> temp;
            if (inverseFreq.get(frequency) == null) {
                temp =  new ArrayList<Character>();
            } else {
                temp = inverseFreq.get(frequency);
            } 
 
            int counter = frequency;
            while (counter > 0) {
                temp.add(c);  
                counter--;
            }
            
            inverseFreq.put(frequency, temp);
        }

        StringBuilder sb = new StringBuilder();
        while (maxOccurrances > 0) {
            if (inverseFreq.get(maxOccurrances) != null) {
                List<Character> temp = inverseFreq.get(maxOccurrances);
                for (int i = 0; i < temp.size(); i++) {
                    sb = sb.append(temp.get(i));
                }
            }

            maxOccurrances--;
        }

        return sb.toString();
    }
}