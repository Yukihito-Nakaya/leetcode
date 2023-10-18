class Solution {
    public boolean isPalindrome(int x) {
        String sx = Integer.valueOf(x).toString();
        int i = 0,k = sx.length() -1;
        while(i <= sx.length() /2){
            if(sx.charAt(i) != sx.charAt(k)){
                 return false;
            } 
            i++;
            k--;
        }
        return true;
    }
}