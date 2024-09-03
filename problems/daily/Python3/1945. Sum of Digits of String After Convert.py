class Solution:
    def getLucky(self, s: str, k: int) -> int:
        ans = ''
        for i in s:
            ans += str(ord(i) - ord("a") +1) 

        while k > 0:
            tent = 0
            for i in ans:
                tent += int(i)
            ans = str(tent)
            k -= 1
        return int(ans)