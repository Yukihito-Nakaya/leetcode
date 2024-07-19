class Solution:
    def luckyNumbers (self, matrix: List[List[int]]) -> List[int]:
        col = len(matrix)
        ans = []
        for i in range(col):
            row_min = min(matrix[i])
            rindex = matrix[i].index(row_min)
            ck = True
            for k in range(col):
                if matrix[k][rindex] > row_min:
                    ck = False
                    break
            if ck:
                ans.append(row_min)
        return ans