class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        int l = s.length();
        int[][] dp = new int[110][110];
        for(int i = 0; i <= l; i++){
            for(int j = 0; j <= k; j++){
                dp[i][j] = 9999;
            }
        }
        dp[0][0] = 0;
        for(int i = 1; i <= l; i++){
            for(int j = 0; j <= k; j++){
                int same = 0, diff = 0;
                for(int p = i; p >= 1 ; p--){
                    if(s.charAt(p - 1) == s.charAt(i - 1)){
                        same++;
                    }else{
                        diff++;
                    }
                    if(j - diff >= 0){
                        dp[i][j] = Math.min(dp[i][j],dp[p - 1][j - diff] + 1 + (same >= 100 ? 3 : same >= 10 ? 2 : same >= 2 ? 1 : 0));

                    }
                }
                if(j > 0){
                    dp[i][j] = Math.min(dp[i][j],dp[i - 1][j - 1]);
                }
            }
        }
        return dp[l][k];
    }
}