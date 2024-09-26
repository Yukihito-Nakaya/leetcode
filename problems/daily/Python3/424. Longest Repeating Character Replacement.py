class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        ac = set(s)
        ans = 0
        for ch in ac:
            tent = 0
            l = 0

            for i in range(len(s)):
                if s[i] !=  ch:
                    tent += 1
                while tent > k:
                    if s[l] != ch:
                        tent -= 1
                    l += 1

                ans = max(ans, i - l + 1)
        return ans