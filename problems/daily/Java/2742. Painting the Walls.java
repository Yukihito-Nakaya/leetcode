class Solution {
    // dpの利用についての説明資料を参考にしました。
    public int paintWalls(int[] cost, int[] time) {
        int l = cost.length;
        int ans[] = new int[l + 1];
        Arrays.fill(ans,(int) 1e9);

        ans[0] = 0;
        for(int i = 0; i < l; i++){
            for(int k = l; k > 0; k--){
                ans[k] = Math.min(ans[k],ans[Math.max(k - time[i] - 1,0)] + cost[i]);
            }
        }
        return ans[l];
    }
}