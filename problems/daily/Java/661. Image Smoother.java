class Solution {
    public int[][] imageSmoother(int[][] img) {
        int l = img.length;
        int lc = img[0].length;
        int[][] ans = new int[l][lc];
        for(int i = 0; i< l; i++){
            for(int j = 0; j< lc; j++){
                int Sum = 0,c = 0;
                for(int k = Math.max(0,i-1); k < Math.min( l,i + 2); k++){
                    for(int x = Math.max(0,j -1); x < Math.min( lc, j + 2); x++){
                        Sum += img[k][x];
                        c++;
                    }
                }
                ans[i][j] =Sum / c;
            }
        }
        return ans;
    }
}