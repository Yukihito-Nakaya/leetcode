from typing import DefaultDict
from collections import defaultdict

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        cs = defaultdict(int)
        ct = defaultdict(int)

        for i in range(len(s)):
            cs[s[i]] += 1
        for i in range(len(t)):
            ct[t[i]] += 1
        
        return cs == ct