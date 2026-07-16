class Solution:
    def gcdSum(self, nums: list[int]) -> int:
        max_index , n = 0 ,len(nums)
        for i in range(n):
            max_index = max(max_index, nums[i])
            nums[i] = gcd(nums[i], max_index)
        
        nums.sort()
        return sum(gcd(nums[i],nums[~i]) for i in range(n >> 1))