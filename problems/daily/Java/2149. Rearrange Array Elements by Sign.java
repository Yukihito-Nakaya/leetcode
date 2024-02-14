class Solution {
    public int[] rearrangeArray(int[] nums) {
        int l = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        int[] ans = new int[l];
        int p = 0;
        for(int i : nums){
            if(i < 0){
                neg.add(i);
            }else{
                pos.add(i);
            }
        }
        for(int i = 0; i < l/2; i++){
            ans[p++] = pos.get(i);
            ans[p++] = neg.get(i);
        }
        return ans;
    }
}