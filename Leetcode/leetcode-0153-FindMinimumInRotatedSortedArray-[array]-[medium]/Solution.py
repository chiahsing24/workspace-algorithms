class Solution:
    def findMin(self, nums: List[int]) -> int:
        left = 0
        right = len(nums) - 1
        while (left + 1 < right):
            mid = left + floor((right - left) / 2)
            if (nums[left] < nums[mid] and nums[mid] < nums[right]):
                right = mid
            elif (nums[mid] > nums[right]):
                left = mid
            else:
                right = mid

        if (nums[left] > nums[right]):
            return nums[right]
        return nums[left]