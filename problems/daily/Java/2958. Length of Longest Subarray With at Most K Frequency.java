class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> tent = new HashMap<>();
        int ans = 0;
        int l =0;
        for(int i = 0; i < nums.length; i++){
            tent.put(nums[i],tent.getOrDefault(nums[i],0) + 1);
            while(tent.get(nums[i]) > k){
                tent.put(nums[l],tent.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans,i-l+1);
        }
        return ans;
    }
}