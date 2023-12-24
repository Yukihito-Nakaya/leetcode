class Solution {
    public int minOperations(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) - '0' != i % 2){
                ans++;
            }
        }
        return Math.min(ans, s.length() - ans);
    }
}
