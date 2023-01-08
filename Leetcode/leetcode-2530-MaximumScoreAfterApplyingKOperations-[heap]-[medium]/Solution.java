class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        
        long score = 0;
        int steps = 0;
        for (int num : nums) {
            heap.add(num);
        }
        
        while (steps < k) {
            int num = heap.poll();
            double updatedNum = (double) num / 3;
            updatedNum = Math.ceil(updatedNum);
            score += num;
            steps++;
            heap.add((int) updatedNum);
        }
        
        return score;
    }
}