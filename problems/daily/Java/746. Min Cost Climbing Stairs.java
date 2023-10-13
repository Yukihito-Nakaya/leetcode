class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int l = cost.length;
        int[] ans = new int[l + 1];
        for(int i = 2; i <= l; i++){
            ans[i] = Math.min(ans[i-1] + cost[i - 1], ans[i - 2] + cost[i -2]);
        } 
        return ans[l];
    }
}