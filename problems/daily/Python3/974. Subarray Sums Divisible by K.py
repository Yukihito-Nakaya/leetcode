class Solution:
    def subarraysDivByK(self, nums: List[int], k: int) -> int:
        ans = 0
        presum = 0
        premap = {0: 1}
        for num in nums:
            presum += num
            mod = presum % k
            ans += premap.get(mod, 0)
            premap[mod] = premap.get(mod, 0) + 1
        return ans
    