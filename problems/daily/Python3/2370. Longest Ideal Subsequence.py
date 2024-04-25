class Solution:
    def longestIdealString(self, s: str, k: int) -> int:
        dp = [0] * 26
        for c in s:
            i = ord(c) - ord("a")
            dp[i] = 1 + max(dp[max(0, i - k):min(26, i + k + 1)])
        return max(dp)