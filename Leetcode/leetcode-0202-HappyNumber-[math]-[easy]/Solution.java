class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        
        int result = n;
        visited.add(n);
        while (n != 1) {
            int temp = 0;
            while (n > 0) {
                int num = n % 10;
                temp += (num * num);
                n /= 10;
            }
            
            if (visited.contains(temp)) {
                return false;
            }
            
            visited.add(temp);
            n = temp;
        }
        
        return true;
    }
}