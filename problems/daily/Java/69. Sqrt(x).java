class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        } 
        int sp = 1, ep = x, cp = -1;
        while(sp <= ep){
            cp = sp + (ep - sp) / 2 ;
            if((long) cp * cp > (long)x){
                ep = cp -1;
            }else if(cp * cp == x){
                return cp;
            }else{
                sp = cp+1;
            }
        }
        return Math.round(ep);
    }
}