class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        cost.sort()
        ans = 0

        for i in range(len(cost) - 1, -1, -1):
            if (len(cost) - 1 - i) % 3 != 2:
                ans += cost[i]

        return ans