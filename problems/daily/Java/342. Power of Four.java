class Solution {
    public boolean isPowerOfFour(int n) {
        if(n <= 0  ||  (1 < n && n <= 3) ) return false;
        while((n != 4) && (n != 1)){
            if((n % 4) != 0){
                return false;
            }
            n = n / 4;
        }
        return true;
    }
}