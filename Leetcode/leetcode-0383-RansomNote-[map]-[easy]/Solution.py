class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        factory = dict()
        for char in magazine:
            factory.update({ char: factory.get(char, 0) + 1 })
            
        for char in ransomNote:
            if (factory.get(char, 0) > 0):
                factory.update({ char: factory.get(char, 0) - 1 })
            else:
                return False
        
        return True