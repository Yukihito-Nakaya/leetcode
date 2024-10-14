class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        s = set(nums)
        ans = []
        tent = []
        def dfs():
            if len(tent) == len(nums):
                ans.append(tent[:])
                return
            for num in s:
                if num in tent:
                    continue
                tent.append(num)
                dfs()
                tent.pop()
        dfs()
        return ans