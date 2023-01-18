class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = [0, 0]
        map = dict()
        for i, num in enumerate(nums):
            value = target - num
            if map.get(value) != None:
                ans = [i, map.get(value)]
            else:
                map.update({num: i})
                
        return ans