class Solution {
    public String getPermutation(int n, int k) {
        List<String> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(String.valueOf(i));
        }
        StringBuilder result = new StringBuilder();
        getPermutation(n, k, nums, result);
        return result.toString();
    }
    
    public void getPermutation(int n, int k, List<String> nums, StringBuilder result) {
        if (n == 1) {
            result.append(nums.get(0));
            return;
        }
        int factorial = 1;
        for (int i = 1; i <= n - 1; i++) {
            factorial *= i;
        }
        int index = (k - 1) / factorial;
        result.append(nums.get(index));
        nums.remove(index);
        k = k - (factorial * index);
        n = n - 1;
        getPermutation(n, k, nums, result);
    }
}