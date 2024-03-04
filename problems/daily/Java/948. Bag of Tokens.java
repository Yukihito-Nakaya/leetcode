class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l = 0;
        int r = tokens.length - 1;
        int score = 0;
        int max = 0;
        
        while(l <= r){
            if(power >= tokens[l]){
                power -= tokens[l];
                l++;
                score++;
                max = Math.max(max, score);
            }else if(score > 0){
                power += tokens[r];
                r--;
                score--;
            }else{
                break;
            }
        }
        return max;
    }
}