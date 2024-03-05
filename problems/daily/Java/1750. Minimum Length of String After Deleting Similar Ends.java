class Solution {
    public int minimumLength(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return r - l + 1;
            }
            char c = s.charAt(l);
            while(l <= r && s.charAt(l) == c){
                l++;
            }
            while(l <= r && s.charAt(r) == c){
                r--;
            }
        }
        return l > r ? 0 : 1;
    }
}