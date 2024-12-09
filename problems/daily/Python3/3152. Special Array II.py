class Solution:
    def isArraySpecial(self, nums: List[int], queries: List[List[int]]) -> List[bool]:
        l = len(nums)
        prefix = [0] * l

        for i in range(1,l):
            prefix[i] = prefix[i-1]
            if (nums[i - 1] % 2 == 0 and nums[i] % 2 == 0) or (nums[i-1] % 2 != 0 and nums[i] % 2 != 0):
                prefix[i] += 1
        
        ans = []

        for lp,rp in queries:
            tent = prefix[rp] -(prefix[lp] if lp > 0 else 0)
            ans.append(tent == 0)

        return ans