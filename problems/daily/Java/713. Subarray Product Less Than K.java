class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
       if (k == 0) return 0;
       int ans = 0;
       int l = nums.length;
       for(int i = 0; i < l; i++){
        int p = 1;
        for(int j = i; j < l; j++){
            p*=nums[j];
            if(p < k) ans++;
            else break;
        }
       } 
       return ans;
    }
}

//another solution

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int){
        int sum = 1;
        int ans = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            sum *= nums[right];
            while(sum >= k && left <= right){
                sum /= nums[left];
                left++;
            }
            ans += right - left + 1;
        }
        return ans;
    }


}