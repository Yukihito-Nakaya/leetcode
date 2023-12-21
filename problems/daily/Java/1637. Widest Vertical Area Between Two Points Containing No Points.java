class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int l = points.length;
        int[] xvalue = new int[points.length];
        int ans = 0;
        for(int i = 0;i < l;i++){
            xvalue[i] = points[i][0];
        }
        Arrays.sort(xvalue);
        for(int i = 0; i < l -1; i++){
            ans = Math.max(ans,xvalue[i + 1] - xvalue[i]);
        }
        return ans;
    }
}