
class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        ans = []
        for i in nums:
            ans.append(nums[i])
        return ans
    
#another solution
class Sokution:
    def buildArray(self, nums: list[int]) -> List[int]:
        l = len(nums)
        for i in range(l):
            nums[i] += l * (nums[nums[i] % l] % l)
        
        for i in range(l):
            nums[i] //= l
        
        return nums