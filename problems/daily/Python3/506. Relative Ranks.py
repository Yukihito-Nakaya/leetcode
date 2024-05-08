class Solution:
    def findRelativeRanks(self, score: List[int]) -> List[str]:
        n = len(score)
        ans = [0] * n
        max = []
        rank = ["Gold Medal", "Silver Medal", "Bronze Medal"]

        for i , s in enumerate(score):
            heappush(max, (-s, i)) 

        num = 1
        while max:
            s, i = heappop(max)
            if num < 4:
                ans[i] = rank[num-1]
            else:
                ans[i] = str(num)
            num += 1
        return ans