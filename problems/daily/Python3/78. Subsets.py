class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        def dfs(index,value):
            ans.append(value)
            for i in range(index,len(nums)):
                dfs(i + 1, value + [nums[i]])
        ans = []
        dfs(0,[])
        return ans
    
# another solution
from copy import deepcopy as cp
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        l = len(nums)
        ans = []
        sub = []

        def rec(i) -> None:
            if i  == l:
                ans.append(cp(sub))
                return
            sub.append(nums[i])
            rec(i + 1)
            sub.pop()

            rec(i + 1)
            return
        rec(0)
        return ans