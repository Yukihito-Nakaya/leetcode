class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int even = 0, odd = nums.length - 1;

        for(int i:nums){
            if(i % 2 == 0){
                res[even] = i;
                even++;
            }else{
                res[odd] = i;
                odd--;
            }
        }
        return res;
    }
}