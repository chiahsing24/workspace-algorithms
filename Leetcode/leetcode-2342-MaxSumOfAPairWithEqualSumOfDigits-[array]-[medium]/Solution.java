class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, List<Integer>> digitsSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            String numStr = String.valueOf(nums[i]);
            int sum = 0;
            for (char digit : numStr.toCharArray()) {
                int digitValue = Integer.valueOf(digit + "");
                sum += digitValue;
            }

            List<Integer> list;
            if (digitsSum.containsKey(sum)) {
                list = digitsSum.get(sum);
            } else {
                list = new ArrayList<>();
            }
            list.add(nums[i]);
            digitsSum.put(sum, list);
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, List<Integer>> entry : digitsSum.entrySet()) {
            int sum = entry.getKey();
            if (digitsSum.get(sum).size() > 1) {
                List<Integer> list = digitsSum.get(sum);
                Collections.sort(list, Collections.reverseOrder());
                max = Math.max(max, list.get(0) + list.get(1));
            }
        }

        return max == Integer.MIN_VALUE ? -1 : max;
    }
}