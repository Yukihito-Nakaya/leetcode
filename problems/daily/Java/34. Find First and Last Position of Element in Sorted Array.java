class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = nums.length;
        int c = 0;
        List<Integer> tent = new ArrayList<Integer>();
        for(int i = 0;i<l;i++){
            if(nums[i] == target){
                tent.add(i);
                c++;
            }
        }
        if(c == 0){
            tent.add(-1);
            tent.add(-1);
        }else if(c == 1){
            tent.add(tent.get(0));
        }
        
        int[] ans = new int[2];
        ans[0] = tent.get(0);
        ans[1] = tent.get(tent.size()-1);

        return ans;
    }
}