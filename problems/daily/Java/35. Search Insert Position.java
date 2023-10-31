class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        int l = nums.length;
        for(int i = 0; i < l; i++){
            if(nums[i] == target)return i;
            if(nums[i] > target){
                ans = i;
                break;
            }
            if(i == l - 1) ans = i + 1;
        }
        return ans;
    }
}