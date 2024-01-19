class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int l = matrix.length;
        int [][] dp = new int[l][l];

        for(int i = 0; i < l;i++){
            dp[0][i] = matrix[0][i];
        }

        for(int i = 1; i < l;i++){
            for(int k = 0; k < l; k++){
                int lv = Integer.MAX_VALUE;
                int rv = Integer.MAX_VALUE;
                int dv = matrix[i][k] + dp[i - 1][k];

                if(k - 1 >= 0){
                    lv = matrix[i][k] + dp[i - 1][k - 1];
                }
                if(k + 1 < l){
                    rv = matrix[i][k] + dp[i - 1][k + 1];
                }

                dp[i][k] = Math.min(dv,Math.min(lv,rv));
            }
        }

        int ans = dp[l - 1][0];
        for(int i = 1; i < l; i++){
            ans = Math.min(ans,dp[l - 1][i]);
        }
        return ans;
    }
}