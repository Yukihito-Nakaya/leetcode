class Solution {
    public int[][] transpose(int[][] matrix) {
        int c = matrix.length;
        int counts = matrix[0].length;
        int[][] ans = new int[counts][c];
        for(int i = 0;i<c;i++){
            for(int k = 0; k < counts;k++){
                ans[k][i] = matrix[i][k];
            }
        }
        return ans;
    }
}