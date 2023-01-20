class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        frequencies = dict({})
        for num in arr:
            frequencies.update({ num: frequencies.get(num, 0) + 1 })
        
        frequencySet = set()
        for freq in frequencies.values():
            if (freq in frequencySet):
                return False
            else:
                frequencySet.add(freq)

        return True