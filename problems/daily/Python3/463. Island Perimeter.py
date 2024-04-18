class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        ans = 0
        for i in range(len(grid)):
            for k in range(len(grid[i])):
                if grid[i][k] == 1:
                    ans += 4
                    if i > 0 and grid[i-1][k] == 1:
                        ans -= 2
                    if k > 0 and grid[i][k-1] == 1:
                        ans -= 2
        return ans