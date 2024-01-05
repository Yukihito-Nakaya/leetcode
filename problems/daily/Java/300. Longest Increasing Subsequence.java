class Solution {
    public int lengthOfLIS(int[] nums) {
        int l = nums.length;
        if(l == 0)return 0;
        int[] dp = new int[l];
        int ans = 1;
        for(int i = 0; i < l; i++){
            dp[i] = 1;
            for(int k = 0; k < i; k++){
                if(nums[k] < nums[i]){
                    dp[i] = Math.max(dp[i],dp[k] + 1);
                }
            }
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}