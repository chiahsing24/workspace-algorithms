class Solution {
    public int cnt;
    
    public int countArrangement(int n) {
        if (n == 1) return 1;
        HashSet<Integer> visited = new HashSet<>();
        getNumOfBeautifulPermutation(n, visited);
        return cnt;
    }
    
    public void getNumOfBeautifulPermutation(int n, HashSet<Integer> visited) {
        if (visited.size() == n) {
            cnt++;
            return;
        }
        
        for (int i = 1; i <= n; i++) {
            if (!visited.contains(i) && ((i % (visited.size() + 1)) == 0 || ((visited.size() + 1) % i == 0))) {
                visited.add(i);
                getNumOfBeautifulPermutation(n, visited);
                visited.remove(i);
            }
        }
    }
}