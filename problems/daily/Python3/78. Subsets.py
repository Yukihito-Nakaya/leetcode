class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        def dfs(index,value):
            ans.append(value)
            for i in range(index,len(nums)):
                dfs(i + 1, value + [nums[i]])
        ans = []
        dfs(0,[])
        return ans