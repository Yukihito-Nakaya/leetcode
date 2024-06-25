class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans = [0,0]
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if target - nums[i] == nums[j]:
                    ans[0] = nums[i]
                    ans[1] = nums[j]
        return ans
    
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if target - nums[i] == nums[j]:
                    return [i,j]