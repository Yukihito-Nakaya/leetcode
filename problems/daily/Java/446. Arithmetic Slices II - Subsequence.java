class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int l = nums.length;
        int ans = 0;
        Map<Integer, Integer>[] dp = new Map[l];
        for(int i = 0; i < l; i++){
            dp[i] = new HashMap<>();
            for(int k = 0; k < i; k++){
                long diff = (long)nums[i] - (long)nums[k];
                if(diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE){
                    continue;
                }
                int d = (int)diff;
                int c1 = dp[i].getOrDefault(d, 0);
                int c2 = dp[k].getOrDefault(d, 0);
                ans += c2;
                dp[i].put(d, c1 + c2 + 1);
            }
        }
        return ans;
    }
}