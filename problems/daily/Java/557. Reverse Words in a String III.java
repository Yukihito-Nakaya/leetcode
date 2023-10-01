class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int l = s.length();
        int sp = 0;
        for(int i = 0;i < l;i++){
            if(s.charAt(i) == ' '){
                for(int k = i-1; k >= sp ;k--){
                    ans.append(s.charAt(k));
                }
                ans.append(s.charAt(i));
                sp = i+1; 
            }

            if (i == l - 1){
                for(int k = i; k >= sp ;k--){
                    ans.append(s.charAt(k));
                }
            }
        }
        return ans.toString();
    }
}