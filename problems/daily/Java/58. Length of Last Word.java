class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        for(int i = s.length() - 1; i >= 0 ;i--){
            if(s.charAt(i) != ' ') ans++;
            if(ans != 0 && s.charAt(i) == ' '){
                break;
            }
        }
        return ans;
    }
}

//another solution

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int ans = 0;
        for(int i = s.length() - 1; i>=0; i--){
            if(s.charAt(i) != ' ') ans++;
            else if(ans > 0){
                break;
            }
        }
        return ans;
    }
}