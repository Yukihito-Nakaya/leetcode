class Solution {
    public int numDecodings(String s) {
        int ans = s.length();
        int dp = new int[ans + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0:1;
        for(int i = 2; i <= ans; i++){
            int one = Integer.valueOf(s.substring(i-1,i));
            int two = Integer.valueOf(s.substring(i-2,i));
            if(one >= 1){
                dp[i] += dp[i-1];
            }
            if(two >= 10 && two <= 26){
                dp[i] += dp[i-2];
            }
        }
        return dp[ans];
    }
}