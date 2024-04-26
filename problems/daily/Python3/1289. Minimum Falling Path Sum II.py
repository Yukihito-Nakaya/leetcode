class Solution:
    def minFallingPathSum(self, grid: List[List[int]]) -> int:
        n = len(grid)
        for i in range(1, n):
            temp = sorted(grid[i -1])
            for k in range(n):
                grid[i][k] += temp[0] if temp[0] != grid[i - 1][k] else temp[1]
        return min(grid[-1])