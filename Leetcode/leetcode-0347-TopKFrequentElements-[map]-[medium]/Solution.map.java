class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        
        int maxOccur = 0;
        for (Integer freq : map.values()) {
            if (freq > maxOccur) {
                maxOccur = freq;
            }
        }
        
        HashMap<Integer, List<Integer>> count = new HashMap<>();
        for (Integer num : map.keySet()) {
            int times = map.get(num);
            
            if (!count.containsKey(times)) {
                count.put(times, new ArrayList<Integer>(Arrays.asList(num)));
            } else {
                List<Integer> temp = count.get(times);
                temp.add(num);
                count.put(times, temp);
            }
        }
        
        List<Integer> temp = new ArrayList<>();
        for (int i = maxOccur; i >= 0; i--) {
            if (count.containsKey(i)) {
                temp.addAll(count.get(i));
            }
        }
        
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp.get(i);
        }
        
        return result;
    }
}