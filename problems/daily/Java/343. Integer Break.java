class Solution {
    public int integerBreak(int n) {
        int ans = 0;
        for(int i = 2; i < n+1; i++){
            int division = n/i, surplus = n%i;
            int multiplication = 1;
            if(surplus == 1){
                for(int k=0;k < i -1;k++){
                    multiplication *= division;
                }
                ans = Math.max(ans,multiplication *= (division + 1));
            }else if(surplus == 0){
                for(int k=0;k < i;k++){
                    multiplication *=division;
                }
                ans = Math.max(ans,multiplication);
            }else{
                for(int k=0;k < division ;k++){
                    multiplication *= i;
                }
                ans = Math.max(ans,multiplication *= surplus);
            }
        }
        return ans;
    }
}