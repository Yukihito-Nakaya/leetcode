class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int ans = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int gc = 0 , sc = 0;
        while(gc < g.length && sc < s.length){
            if(g[gc] <= s[sc]){
                gc++;
                sc++;
                ans++;
            }else{
                sc++;
            }
        }
        return ans;
    }
}