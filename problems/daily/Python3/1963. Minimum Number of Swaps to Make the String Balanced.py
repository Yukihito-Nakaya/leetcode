class Solution:
    def minSwaps(self, s: str) -> int:
        p = 0
        for sh in s:
            p = max(0,p+(sh =='[') - (sh == ']'))
        return (p + 1) // 2