class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        c = 0
        for ch in s:
            if t[c] == ch:
                c += 1
                if c == len(t):
                    return 0
        return len(t) - c