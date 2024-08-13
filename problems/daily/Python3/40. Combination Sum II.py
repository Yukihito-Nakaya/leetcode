class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        ans = []
        candidates.sort()
        def dfs(start, target, path):
            if target == 0:
                ans.append(path)
                return
            for i in range(start, len(candidates)):
                if i > start and candidates[i] == candidates[i-1]:
                    continue
                if candidates[i] > target:
                    break
                dfs(i+1, target-candidates[i], path+[candidates[i]])
        dfs(0, target, [])
        return ans