class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(len(nums)-1):
            if nums[i] == nums[i + 1]:
                return nums[i]
        return -1
    
# another solution
class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        l = len(nums)
        ans = -1

        for i in range(l):
            if nums[abs(nums[i]) - 1] < 0:
                ans = abs(nums[i])
                break
            
            nums[abs(nums[i] -1)] *= -1
        
        for i in range(l):
            nums[i] = abs(nums[i])
        
        return ans