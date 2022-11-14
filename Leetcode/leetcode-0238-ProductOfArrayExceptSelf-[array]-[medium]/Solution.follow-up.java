class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer, 1);
        
        for (int i = 1; i < nums.length; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }
        
        int rightTotal = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rightTotal *= nums[i + 1];
            answer[i] = rightTotal * answer[i];
        }
        
        return answer;
    }
}
