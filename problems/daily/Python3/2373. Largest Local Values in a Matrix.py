class Solution:
    def largestLocal(self, grid: List[List[int]]) -> List[List[int]]:
        l = len(grid)
        ans = []
        for i in range(1,l-1):
            temp = []
            for j in range(1,l-1):
                temp_val = 0
                for k in range(i-1,i+2):
                    for m in range(j-1,j+2):
                        temp_val = max(temp_val,grid[k][m])
                temp.append(temp_val)
            ans.append(temp)
            
        return ans
    