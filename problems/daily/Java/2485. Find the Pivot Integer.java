class Solution {
    public int pivotInteger(int n) {
        int sum = (n * (n + 1)) / 2;
        long pp = 0;
        for (int i = 1; i <= n; i++) {
            pp += i;
            if (2 * pp == sum - i) {
                return i;
            }
        }
        return -1;
    }
}