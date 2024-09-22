class Solution:
    def getSubarrayBeauty(self, nums: List[int], k: int, x: int) -> List[int]:
        c = collections.defaultdict(int)

        def find_minimum(x: int) -> int:
            fc = 0
            for i in range(-50, 0):
                fc += c[i]
                if fc >= x:
                    return i
            return 0
        
        ans = []
        for i in range(k):
            c[nums[i]] += 1
        
        ans.append(find_minimum(x))

        for i in range(k, len(nums)):
            c[nums[i-k]] -= 1
            c[nums[i]] += 1
            ans.append(find_minimum(x))

        return ans