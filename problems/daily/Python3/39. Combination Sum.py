from copy import deepcopy as cp

class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        candidates.sort()
        l = len(candidates)
        ans = []

        tent = []

        def dfs(i,sum):
            if sum == 0:
                ans.append(cp(tent))
                return
            for k in range(i,l):
                num = candidates[k]
                if num > sum:
                    break
                tent.append(num)
                dfs(k,sum - num)
                tent.pop()
        
        dfs(0,target)

        return ans