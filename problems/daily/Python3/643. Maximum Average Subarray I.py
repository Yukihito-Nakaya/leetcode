class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        ans = 0
        cursum = 0

        for i in range(k):
            cursum += nums[i]
        
        ans = cursum

        for i in range(k,len(nums)):
            cursum -= nums[i - k]
            cursum += nums[i]
            ans = max(ans,cursum)
        
        return ans / k 