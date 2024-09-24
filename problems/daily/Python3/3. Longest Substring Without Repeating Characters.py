class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        ans = 0
        other = set()

        for i in range(len(s)):
            while s[i] in other:
                other.remove(s[l])
                l += 1
            other.add(s[i])
            ans = max(len(other), ans)
        
        return ans
    