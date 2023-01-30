/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
 class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();
        int foundAt = -1;
        int peak = - 1;
        
        // Find peak 
        int left = 0, right = length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (mountainArr.get(left) > mountainArr.get(right)) {
            peak = left;
        } else {
            peak = right;
        }

        left = 0;
        right = peak;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (target > mountainArr.get(mid)) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (mountainArr.get(left) == target) {
            foundAt = left;
        } else if (mountainArr.get(right) == target) {
            foundAt = right;
        }

        if (foundAt != -1) {
            return foundAt;
        } 

        left = peak;
        right = length - 1;
        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (target > mountainArr.get(mid)) {
                right = mid;
            } else {
                left = mid;
            }
        }

        if (mountainArr.get(left) == target) {
            foundAt = left;
        } else if (mountainArr.get(right) == target) {
            foundAt = right;
        }


        return foundAt;
    }
}