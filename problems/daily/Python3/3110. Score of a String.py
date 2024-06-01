class Solution:
    def scoreOfString(self, s: str) -> int:
        ans = 0
        l = len(s)
        for i in range(l -1):
            ans += abs(ord(s[i]) - ord(s[i+1]))
        return ans