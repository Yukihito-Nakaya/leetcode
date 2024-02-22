class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] a = new int[n+1];
        int[] b = new int[n+1];
        for(int[] i: trust){
            b[i[0]]++;
            a[i[1]]++;
        }
        for(int i = 1; i<= n; i++){
            if(a[i] == n - 1 && b[i] == 0){
                return i;
            }
        }
        return -1;
    }
}