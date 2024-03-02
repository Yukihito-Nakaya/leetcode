class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        for(int i = 0; i<l; i++){
            ans[i]= nums[i] * nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}

// another solution:
class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        for(int i = 0; i < l; i++){
            nums[i] *= nums[i];
        }
        int i = l -1;
        int n = 0, r = l -1;
        while(n <= r){
            if(nums[n] > nums[r]){
                ans[i--] = nums[n++];
            } else {
                ans[i--] = nums[r--];
            }
        }
        return ans;
    }
}