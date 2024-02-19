class Solution {
    public long largestPerimeter(int[] nums) {
        long ans = 0;
        Arrays.sort(nums);
        for(int i:nums){
            ans += i;
        }
        int l = nums.length;
        for(int i = n - 1; i >= 2; i--){
            ans -= nums[i];
            if(ans > nums[i]){
                return ans + nums[i];
            }
        }
        return -1;
    }
}