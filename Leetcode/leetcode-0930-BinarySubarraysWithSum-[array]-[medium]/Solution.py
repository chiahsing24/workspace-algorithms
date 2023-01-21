class Solution:
    def numSubarraysWithSum(self, nums: List[int], goal: int) -> int:
        cnt = 0
        prefix = 0
        prefixHistory = dict({})
        prefixHistory.update({ 0: 1 })

        for num in nums:
            prefix += num
            if (prefixHistory.get(prefix - goal) != None):
                cnt += prefixHistory.get(prefix - goal, 0)

            prefixHistory.update({ prefix: prefixHistory.get(prefix, 0) + 1 })

        return cnt