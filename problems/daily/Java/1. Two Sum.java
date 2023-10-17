class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int l = nums.length;
        for(int i = 0; i < l - 1; i++){
            int diff = target - nums[i];
            for(int k = i + 1; k < l; k++){
                if(diff == nums[k]){
                    ans[0] = i;
                    ans[1] = k;
                    break;
                }
            }
        }
        return ans;
    }