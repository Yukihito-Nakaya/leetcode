class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        psum = 0
        psumc = defaultdict(int)
        psumc[0] = 1

        ans = 0

        for i in nums:
            psum += i
            if psum -k in psumc:
                ans += psumc[psum - k]
            psumc[psum] += 1
        
        return ans 