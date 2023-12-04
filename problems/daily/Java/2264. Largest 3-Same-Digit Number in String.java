class Solution {
    public String largestGoodInteger(String num) {
        int max = -1;
        for(int i = 0; i + 2 < num.length(); i++){
            if(num.charAt(i) == num.charAt(i + 1) && (num.charAt(i) == num.charAt(i + 2))){
                    max = Math.max(max,num.charAt(i) - '0');
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 3; i++){
            ans.append((char)(48 + max));
        }
        return max == -1 ? "": ans.toString();
    }
}