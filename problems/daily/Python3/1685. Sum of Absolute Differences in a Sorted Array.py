class Solution:
    def getSumAbsoluteDifferences(self, nums: List[int]) -> List[int]:
        # ans = []

        # for i in range(len(nums)):
        #     v = 0
        #     for k in range(len(nums)):
        #         v += abs(nums[i]-nums[k])
            
        #     ans.append(v)
        
        # return ans
        l = len(nums)
        ps = [0] * (l + 1)
        for i in range(l):
            ps[i + 1] = ps[i] + nums[i]

        ans = []

        for i in range(l):
            ls = ps[i] - ps[0]
            rs = ps[l] - ps[i+1]

            lc = i
            rc = l - (i+1)

            lsum = nums[i]* lc - ls
            rsum = rs - nums[i] * rc

            ans.append(lsum + rsum)
        
        return ans