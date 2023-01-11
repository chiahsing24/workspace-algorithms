class Solution {
    public int countElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int cnt = 0;
        for (int num : arr) {
            if (map.containsKey(num) && map.containsKey(num + 1)) {
                cnt++;
                map.put(num, map.get(num) - 1);
                map.put(num + 1, map.get(num + 1) - 1);
            }
        }

        return cnt;
    }
}