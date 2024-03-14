class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int[] sum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += map.getOrDefault(sum[i] - goal, 0);
            map.put(sum[i], map.getOrDefault(sum[i], 0) + 1);
        }
        return res; 
    }
}