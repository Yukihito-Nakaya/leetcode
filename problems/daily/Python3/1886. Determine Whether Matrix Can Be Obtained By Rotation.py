class Solution:
    def findRotation(self, mat: List[List[int]], target: List[List[int]]) -> bool:
        check = [True] * 4
        l = len(mat)
        for i in range(l):
            for k in range(l):
                if mat[i][k] != target[k][l-i-1]:
                    check[0] = False
                if mat[i][k] != target[l-i-1][l-k-1]:
                    check[1] = False
                if mat[i][k] != target[l-k-1][i]:
                    check[2] = False
                if mat[i][k] != target[i][k]:
                    check[3] = False
        return any(check)