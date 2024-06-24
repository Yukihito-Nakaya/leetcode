class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        ans = 0
        l = len(nums)
        for i in range(l):
            for j in range(i+1,l):
                if nums[i]== nums[j]:
                    ans+=1
        return ans