class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        int i = 0,k = 0;
        while(i < neededTime.length && k < neededTime.length){
            int total = 0, max = 0;
            while(i < neededTime.length && k < neededTime.length && colors.charAt(i) == colors.charAt(k)){
                total += neededTime[k];
                max = Math.max(max,neededTime[k]);
                k++;
            }
            ans += total - max;
            i = k;
        }
        return ans;
    }
}