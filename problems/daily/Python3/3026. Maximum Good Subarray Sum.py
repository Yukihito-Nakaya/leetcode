class Solution:
    def maximumSubarraySum(self, nums: List[int], k: int) -> int:
        ans = float('-inf')
        l = len(nums)
        SubarraySum = [0] * (l + 1)

        for i in range(l):
            SubarraySum[i + 1] = SubarraySum[i] + nums[i]
        
        tent = {}

        for i , num in enumerate(nums):
            for tg in [num - k,num + k]:
                if tg in tent:
                    ans = max(ans, SubarraySum[i + 1] - SubarraySum[tent[tg]])
            
            if num in tent and SubarraySum[i + 1] - SubarraySum[tent[num]] < nums[i]:
                tent[num] = i
            elif num not in tent:
                tent[num] = i
        
        return ans  if ans != float('-inf') else 0