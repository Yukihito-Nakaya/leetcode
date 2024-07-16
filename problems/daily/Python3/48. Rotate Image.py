class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        l = len(matrix)
        for i in range(l // 2):
            for k in range(i, l - i - 1):
                tent = matrix[i][k]
                matrix[i][k] = matrix[l - k - 1][i]
                matrix[l-k-1][i] = matrix[l-i-1][l - k -1]
                matrix[l-i-1][l - k -1] = matrix[k][l - i - 1]
                matrix[k][l - i - 1] = tent
        return matrix