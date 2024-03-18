class Solution {
    public int findMinArrowShots(int[][] points) {
           Arrays.sort(points,(a,b) ->{
            if(a[0] == b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
           });
           int ans = 1;
           long end = points[0][1]; 
           for(int i = 1; i < points.length; i++){
               if(end >= points[i][0]){
                if(end > points[i][1]){
                    end = points[i][1];
                }
               }else{
                   end = points[i][1];
                   ans++;
               }
           }
           return ans;
    }
}