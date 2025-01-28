class Solution:
    def destCity(self, paths: List[List[str]]) -> str:
        map = {}
        for i in range(len(paths)):
            map[paths[i][0]] = paths[i][1]

        i = paths[0][0]
        while map.get(i) in map:
            i = map.get(i)

        return map.get(i)