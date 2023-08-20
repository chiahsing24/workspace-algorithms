class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curVal = 'unknown'
        cnt = 0
        i = 0
        j = 0
        while (i < len(nums)):
            if (nums[i] != curVal):
                curVal = nums[i]
                cnt = 1
                nums[j] = nums[i]
                j = j + 1
            elif (nums[i] == curVal and cnt < 2):
                cnt = cnt + 1
                nums[j] = nums[i]
                j = j + 1

            
            i = i + 1
        
        return j