class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean up= true;
        boolean down = true;
        for(int i = 1;i<nums.length;i++){
            int b = i -1;
            if(nums[i] < nums[b]){
                down = false;
            }else if(nums[i] > nums[b]){
                up = false;
            }
            if(!down && !up)break;
        }
        return down || up; 
    }
}