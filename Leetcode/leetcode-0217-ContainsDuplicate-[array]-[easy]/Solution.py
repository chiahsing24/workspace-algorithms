class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        counts = dict({})
        for num in nums:
            counts.update({num: counts.get(num, 0) + 1})
        
        for num in nums:
            if (counts.get(num) >= 2):
                return True
        
        return False