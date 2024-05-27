class Solution:
    def specialArray(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(len(nums) + 1):
            ans = 0
            for k in range(len(nums)):
                if nums[k] >= i:
                    ans += 1
            if ans == i:
                return ans
        return -1