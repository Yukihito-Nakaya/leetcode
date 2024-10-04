class Solution:
    def findDuplicates(self, nums: List[int]) -> List[int]:
        l = len(nums)
        ans = []

        for i in range(l):
            if nums[abs(nums[i]) -1] < 0:
                ans.append(abs(nums[i]))
            else:
                nums[abs(nums[i]) -1] *= -1
        
        return ans