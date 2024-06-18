class Solution:
    def maxProfitAssignment(self, difficulty: List[int], profit: List[int], worker: List[int]) -> int:
        if max(worker) < min(difficulty): return 0
        worker.sort()
        diff = sorted(list(zip(profit,difficulty)))
        profits = []
        for i in range(len(diff) -1,-1,-1):
            if i == len(diff) -1:
                profits.append(diff[i])
            else:
                if diff[i][1] < profits[-1][1]:
                    profits.append(diff[i])
        profits = [(0,0)] + profits[::-1]
        counts,ans = 0,0
        for i in worker:
            while counts + 1 < len(profits) and profits[counts + 1][1] <= i:
                counts += 1
            ans += profits[counts][0]
        return ans