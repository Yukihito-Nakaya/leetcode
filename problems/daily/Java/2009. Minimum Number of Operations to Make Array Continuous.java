class Solution {
    public int minOperations(int[] nums) {
        int l = nums.length;
        int ans = l, c = 1;
        Arrays.sort(nums);

        for(int i = 1; i < l; i++){
            if(nums[i] != nums[i - 1]){
                nums[c++] = nums[i];
            }
        }
        for(int i = 0,k = 0; i < c; i++){
            while(k < c && nums[k] - nums[i] <= l -1){
                k++;
            }
            ans = Math.min(ans,l-(k - i));
        }

        return ans;

    }
}