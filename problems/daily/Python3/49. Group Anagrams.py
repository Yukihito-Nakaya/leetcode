from typing import DefaultDict
from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        tent = defaultdict(list)
        for s in strs:
            cnt = [0] * 26
            for sc in s:
                cnt[ord(sc) - ord('a')] += 1
            tent[tuple(cnt)].append(s)

        return list(tent.values())