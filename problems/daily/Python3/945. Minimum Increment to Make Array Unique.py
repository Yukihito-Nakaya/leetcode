class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        nums.sort()
        tent = 0
        ans = 0
        for i in nums:
            tent = max(tent,i)
            ans += tent - i
            tent += 1
        return ans
    