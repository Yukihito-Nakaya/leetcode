class Solution:
    def numSteps(self, s: str) -> int:
        value = int(s,2)
        ans = 0
        while value > 1:
            if value % 2 == 0:
                value //= 2
            else:
                value += 1
            ans += 1
        return ans                