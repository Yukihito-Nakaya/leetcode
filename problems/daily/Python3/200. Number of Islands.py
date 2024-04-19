class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        def dfs(grid,i,k):
            if i < 0 or k < 0 or i >= len(grid) or k >= len(grid[i]) or grid[i][k] == '0':
                return
            grid[i][k] = '0'
            dfs(grid,i-1,k)
            dfs(grid,i+1,k)
            dfs(grid,i,k-1)
            dfs(grid,i,k+1)
        ans = 0
        for i in range(len(grid)):
            for k in range(len(grid[i])):
                if grid[i][k] == '1':
                    ans += 1
                    dfs(grid,i,k)
        return ans