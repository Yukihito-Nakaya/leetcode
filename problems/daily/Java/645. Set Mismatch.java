class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] ans = new int[2];
        int l = nums.length;
        int [] arr = new int[l + 1];
        for(int i = 0; i < l; i++){
            arr[nums[i]]++;
        }
        for(int i = 1; i <= l; i++){
            if(arr[i] == 0){
                ans[1] = i;
            }
            if(arr[i] == 2){
                ans[0] = i;
            }
        }
        return ans; 
    }
}