class Solution:
    def totalCost(self, costs: List[int], k: int, candidates: int) -> int:
        lp = 0
        rp = len(costs) -1
        lhp = []
        rhp = []

        ans = 0

        while k > 0:
            while len(lhp) < candidates and lp <= rp:
               heappush(lhp,costs[lp])
               lp += 1
            
            while len(rhp) < candidates and lp <= rp:
                heappush(rhp,costs[rp])
                rp -= 1
            
            t1 = lhp[0] if lhp else float('inf')
            t2 = rhp[0] if rhp else float('inf')

            if t1 <= t2:
                ans += t1
                heappop(lhp)
            else:
                ans += t2
                heappop(rhp)

            k -= 1
        return ans 