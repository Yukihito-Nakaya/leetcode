class Solution:
    def minOperations(self, logs: List[str]) -> int:
        ans = 0
        for ch in logs:
            if ch == "../":
                ans -= 1 if ans > 0 else 0
            elif ch == "./":
                ans += 0
            else:
                ans += 1

        return ans