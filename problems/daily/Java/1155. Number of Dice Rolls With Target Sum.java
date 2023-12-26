class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n+1][target+1];
        int mod = 1000000007;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= target; j++){
                if(i == 1){
                    if(j <= k){
                        dp[i][j] = 1;
                    }
                } else {
                    for(int l = 1; l <= k; l++){
                        if(j - l >= 1){
                            dp[i][j] = (dp[i][j] + dp[i-1][j-l]) % mod;
                        }
                    }
                }
            }
        }
        return dp[n][target];
    }
}