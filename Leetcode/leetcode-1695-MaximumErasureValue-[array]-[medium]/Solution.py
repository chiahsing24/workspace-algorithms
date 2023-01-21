class Solution:
    def maximumUniqueSubarray(self, nums: List[int]) -> int:
        prefix = [0] * len(nums)
        prefix[0] = nums[0]
        for i, num in enumerate(nums):
            if (i >= 1):
                prefix[i] = prefix[i - 1] + num
        
        visited = set()

        sum = 0
        i = 0
        j = 0
        while (j < len(nums)):
            while (j < len(nums) and i < len(nums) and nums[j] not in visited):
                sum = max(sum, prefix[j] - prefix[i] + nums[i])
                visited.add(nums[j])
                j = j + 1

            while (i < len(nums) and j < len(nums) and nums[j] in visited):
                visited.remove(nums[i])
                i = i + 1

        return sum