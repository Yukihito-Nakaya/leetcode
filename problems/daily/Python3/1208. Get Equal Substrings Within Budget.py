class Solution:
    def equalSubstring(self, s: str, t: str, maxCost: int) -> int:
        l = len(s)
        sp = 0
        cc = 0
        ans = 0

        for i in range(l):
            cc += abs(ord(s[i]) - ord(t[i]))
            while cc > maxCost:
                cc -= abs(ord(s[sp]) - ord(t[sp]))
                sp += 1
            ans = max(ans,i - sp + 1)

        return ans