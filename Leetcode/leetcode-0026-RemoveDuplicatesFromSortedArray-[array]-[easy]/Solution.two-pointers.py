class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 0
        j = 0
        curVal = 'unknown'
        while (i < len(nums)):
            if (nums[i] != curVal):
                curVal = nums[i]
                nums[j] = nums[i]
                j = j + 1
            
            i = i + 1

        return j