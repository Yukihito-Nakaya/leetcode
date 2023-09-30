class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> s = new Stack<>();
        int tent = Integer.MIN_VALUE;
        int l = nums.length;
        for(int i = l - 1; i >= 0; i-- ){
            if(nums[i] < tent)return true;
            while(!s.isEmpty() && s.peek() < nums[i]){
                tent = s.pop();
            }
            s.push(nums[i]);
        }
        return false;
    }
}