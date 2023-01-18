class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        is_jewels = dict({})
        for jewel in jewels:
            is_jewels.update({jewel: True})
        
        cnt = 0
        for stone in stones:
            if (is_jewels.get(stone)):
                cnt = cnt + 1
        
        return cnt