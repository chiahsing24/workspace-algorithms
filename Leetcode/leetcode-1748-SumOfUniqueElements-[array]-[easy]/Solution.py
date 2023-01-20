class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        visited = dict({})
        for num in nums:
            visited.update({ num: visited.get(num, 0) + 1})
        
        sum = 0
        for k, v in visited.items():
            if (v == 1):
                sum += k
        
        return sum