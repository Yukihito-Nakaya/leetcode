class Solution:
    def getLucky(self, s: str, k: int) -> int:
        ans = 0
        for i in s:
            ans += ord(i) - ord("a")

        while k > 0:
            str(ans)
            tent = 0
            for i in ans:
                tent += int(i)
            ans = tent
        return ans