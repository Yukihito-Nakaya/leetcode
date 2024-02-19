class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 1)return true;
        if(n%2 == 1 || n <= 0)return false;
        while(n > 3){
            n = n/2;
            if(n%2 == 1){
                return false;
            }
        }
        return true;
    }
}

//another solution
class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i = 0; i < 31; i++){
            int ans = (int) Math.pow(2,i);
            if(ans == n)return true;
        }
        return false;
    }
}