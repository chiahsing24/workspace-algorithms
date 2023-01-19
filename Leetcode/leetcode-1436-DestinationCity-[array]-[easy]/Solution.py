class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        map = dict({})
        for pair in paths:
            start, destination = pair
            map.update({ start: destination })
        
        finalDestination = ""
        for destination in map.values():
            if (map.get(destination) == None):
                finalDestination = destination

        return finalDestination