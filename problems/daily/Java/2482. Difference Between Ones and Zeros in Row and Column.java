class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int l = grid.length;
        int al = grid[0].length;
        int[] row = new int[l];
        int[] col = new int[al];
        for (int i = 0; i < l; i++) {
            for (int k = 0; k < al; k++) {
                row [i] += grid[i][k];
                col [k] += grid[i][k];
            }
        }
        for (int i = 0; i < l; i++) {
            for(int k = 0; k < al; k++) {
                grid[i][k] = 2 * (row[i] + col[k]) - grid.length - grid[0].length;
            }
        }

        return grid;
    }
}