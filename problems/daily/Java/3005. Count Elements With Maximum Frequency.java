class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int ans = 0;
        int max = Integer.MIN_VALUE;
        for(int i : map.values()){
            max = Math.max(max, i);
        }
        for(int i : map.values()){
            if(i == max){
                ans += max;
            }
        }

        return ans;
    }
}