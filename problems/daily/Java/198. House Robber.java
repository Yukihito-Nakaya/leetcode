class Solution {
    public int rob(int[] nums) {
       int rob = 0;
       int no = 0;
       for(int i = 0; i < nums.length; i++){
           int tent1 = no + nums[i];
           int tent2 = Math.max(no,rob);
           rob = tent1;
           no = tent2;
       } 
       return Math.max(rob,no);
    }
}