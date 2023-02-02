class Solution {
    public int findBestValue(int[] arr, int target) {
        // 1. Possible right bound for value is Max(arr)
        // 2. Possible left bound for value is 0, because every integer in arr is greater than 0.
        //    Reason is because if replace every integers in arr with 0, the sum of arr will be 0.
        //    If we continue decrement the value's value to negative number, then the sum of the arr will be negative. So further increase the difference between sum and target.
        int left = 0;
        int right = findMaxOfArr(arr);
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (sumOfAdjustArr(arr, mid) > target) {
                right = mid;
            } else {
                left = mid;
            }
        }

        double leftSum = sumOfAdjustArr(arr, left);
        double rightSum = sumOfAdjustArr(arr, right);
        if (Math.abs(leftSum - target) > Math.abs(rightSum - target)) {
            return right;
        } else {
            return left;
        }
    
    }

    public int findMaxOfArr(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public int sumOfAdjustArr(int[] arr, int value) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                sum += value;
            } else {
                sum += arr[i];
            }
        }

        return sum;
    }
}