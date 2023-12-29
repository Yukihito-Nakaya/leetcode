class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int l = jobDifficulty.length;
        if(l < d)return -1;
        int ans = 0;
        if(l == d){
            for(int i = 0;i<l;i++){
                ans+=jobDifficulty[i];
            }
            return ans;
        }
        
        int[][] dp = new int[310][310];
        for(int i = 0; i <= l; i++){
            for(int j = 0; j <= d; j++){
                dp[i][j] = 9999;
            }
        }
        dp[0][0] = 0;
        for(int i = 1; i <= l; i++){
            for(int j = 1; j <= d; j++){
                int max = 0;
                for(int p = i; p >= j; p--){
                    max = Math.max(max,jobDifficulty[p - 1]);
                    dp[i][j] = Math.min(dp[i][j],dp[p - 1][j - 1] + max);
                }
            }
        }
        return dp[l][d] == 9999 ? -1 : dp[l][d];
    }
}