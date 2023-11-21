class Solution {
    public int maxProfit(int[] prices) {
        int ans =0;
        int mini = prices[0],max = 0;
        for(int i=1; i < prices.length;i++){
            if(mini > prices[i]){
                mini = prices[i];
                max = 0;
            }
            if(max <  prices[i])max = prices[i];
            if(max - mini > 0)ans =Math.max(ans,max - mini);
        }
        return ans;
    }
}