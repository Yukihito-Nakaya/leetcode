class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        int l = nums.length;
        for(int i = 0; i < l- 1;i++){
            for(int k = i + 1;k < l; k++){
                if(nums[i] == nums[k]) res++;
            }
        }
        return res;
    }
}