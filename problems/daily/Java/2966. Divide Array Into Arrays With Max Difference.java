class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] ans = new int[0][0];

        for(int i = 0; i + 2 < nums.length; i++){
            if(i % 3 == 0){
                if(nums[i + 2] - nums[i] <= k){
                    int[] temp = new int[3];
                    temp[0] = nums[i];
                    temp[1] = nums[i + 1];
                    temp[2] = nums[i + 2];
                    ans = Arrays.copyOf(ans, ans.length + 1);
                    ans[ans.length - 1] = temp;
                } else {
                    return new int[0][0];
                }
            }
        }
        return ans;
    }
}