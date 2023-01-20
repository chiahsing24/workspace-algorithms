class Solution:
    def findLucky(self, arr: List[int]) -> int:
        largest = -1
        freq = dict({})
        for num in arr:
            freq.update({ num: freq.get(num, 0) + 1 })
        
        for k, v in freq.items():
            if (k == v):
                largest = max(largest, k)
        
        return largest