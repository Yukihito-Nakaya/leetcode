class Solution:
    def matrixScore(self, grid: List[List[int]]) -> int:
        n,m = len(grid),len(grid[0])
        ans = (1 << (m - 1)) * n

        for j in range(1,m):
            val = 1 << (m - j - 1)
            count = 0

            for i in range(n):
                if grid[i][j] == grid[i][0]:
                    count += 1

            ans += max(count,n - count) * val
        
        return ans