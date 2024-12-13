class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        ans = 0
        for sh in columnTitle:
            ## ord('A') = 65
            ans = ans*26 + ord(sh) - 64
        return ans