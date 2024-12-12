import math
from heapq import heapify, heappop, heappush

class Solution:
    def pickGifts(self, gifts: List[int], k: int) -> int:
        ans = [-i for i in gifts]
        heapify(ans)
        while k:
            tent = math.isqrt(-heappop(ans))
            heappush(ans,-tent)
            k -= 1
        return -sum(ans)
    
solution = Solution()
gifts = [25,64,9,4,100]
k = 4

print(solution.pickGifts(gifts, k))