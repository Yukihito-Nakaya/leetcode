import java.util.Map;

class Solution {
    public int minOperations(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(val == 1){
                return -1;
            }
            ans += val / 3;
            if(val % 3 != 0){
                ans ++;
            }
        }
        return ans;
    }
}