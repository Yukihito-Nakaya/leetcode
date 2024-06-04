class Solution:
    def longestPalindrome(self, s: str) -> int:
        c = 0
        fq = {}

        for ch in s:
            fq[ch] = fq.get(ch,0) + 1
            if fq[ch] % 2 == 0:
                c -= 1
            else:
                c += 1
        if c > 1:
            return len(s) - c + 1
        return len(s)