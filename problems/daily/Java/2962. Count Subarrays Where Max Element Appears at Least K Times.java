class Solution {
    public long countSubarrays(int[] nums, int k) {
        List<Integer> check = new ArrayList<>();
        long ans = 0;
        int max = 0;
        for(int i :nums) max = Math.max(max,i);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == max) check.add(i+1);
            if(check.size() >= k) ans += check.get(check.size() - k);
        }
        return ans;
    }
}


//another solution
class Solution {
    public long countSubarrays(int[] nums, int k) {
        long ans = 0;
        int max =0 , c = 0, l = nums.length;
        for(int i :nums) max = Math.max(max,i);
        int n = 0;
        for(int i = 0; i < l; i++){
            if(nums[i] == max)c++;
            while (c >= k){
                ans += l - i;
                if(nums[n] == max) c--;
                n++;
            }
        }
        return ans;
    }
}