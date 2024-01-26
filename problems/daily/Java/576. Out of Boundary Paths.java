class Solution {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        final int MOD = 1000000007;
        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        int ans = 0;

        for(int mov = 1; mov <= maxMove; mov++){
            int[][] temp = new int[m][n];

            for(int i = 0; i < m; i++){
                for(int k = 0; k < n; k++){
                    if(i == m -1) ans = (ans + dp[i][k]) % MOD;
                    if(k == n -1) ans = (ans + dp[i][k]) % MOD;
                    if(i == 0) ans = (ans + dp[i][k]) % MOD;
                    if(k == 0) ans = (ans + dp[i][k]) % MOD;
                    temp[i][k] = (
                        ((i > 0 ? dp[i-1][k] : 0) + (i < m - 1 ? dp[i+1][k] : 0)) % MOD + ((k > 0 ? dp[i][k-1] : 0) + (k < n - 1 ? dp[i][k+1] : 0)) % MOD) % MOD;
                }
            }
            dp = temp;
        }
        return ans;
    }
}