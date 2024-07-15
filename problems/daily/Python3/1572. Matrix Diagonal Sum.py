class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
      ans = 0
      l = len(mat)
      for i in range(l):
        ans += mat[i][i] + mat[i][l-i-1]
        if l % 2:
            ans -= mat[l//2][l//2]
            
        return ans
      