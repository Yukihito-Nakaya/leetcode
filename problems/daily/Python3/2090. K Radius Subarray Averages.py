class Solution:
    def getAverages(self, nums: List[int], k: int) -> List[int]:
            a=k
            k=2*k+1
            if len(nums) < k:return [-1]*len(nums)
            ans,sm =[-1]*a,0

            for i in range(k):sm+=nums[i]
            ans.append(sm//k)
            for i in range(len(nums)-k):
                  sm -= nums[i]
                  sm += nums[i + k]
                  ans.append(sm//k)
            for i in range(a): ans.append(-1)
            return ans