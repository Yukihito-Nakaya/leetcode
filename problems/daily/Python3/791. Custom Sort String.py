class Solution:
    def customSortString(self, order: str, s: str) -> str:
        dic = defaultdict(int)
        for i in range(len(order)):
            dic[order[i]] = i
        
        return "".join(sorted(s,key = lambda c: dic[c]))