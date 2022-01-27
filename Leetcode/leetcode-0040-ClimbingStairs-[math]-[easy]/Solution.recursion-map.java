class Solution {
    public Map<Integer, Integer> map = new HashMap<>();
    
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        if (map.get(n) != null) {
            return map.get(n);
        } else {
            int value = climbStairs(n - 1) + climbStairs(n - 2);
            map.put(n, value);
            return value;
        }
    }
}