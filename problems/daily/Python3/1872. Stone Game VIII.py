class Solution:
    def stoneGameVIII(self, stones: List[int]) -> int:
        #累積和配列 stones[1..n-1]
        n = len(stones)
        for i in range(1,n):
            stones[i] += stones[i-1]
            #dp[i] :=(自分の獲得スコア - 相手の獲得スコア)
        # dp[i] = max(a, b)
        dp = [0] * n
        dp[n-1] = stones[n-1]
        for i in range(n-2,0,-1):
            dp[i] = max(dp[i+1],stones[i]-dp[i+1])
        return dp[1]