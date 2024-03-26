class Solution {
    public int firstMissingPositive(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            while (nums[i] > 0 && nums[i] <= l && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < l; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return l + 1;
    }
}