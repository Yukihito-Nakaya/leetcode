class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int a = n/7;
        int b = n%7;
        for(int i = 1; i <= a; i++){
            ans += (7*(2*i+6))/2;
        }
        for(int i = 1; i <= b; i++){
            ans += (a+i);
        }
        return ans;
    }
}