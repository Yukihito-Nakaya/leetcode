class Solution {
    public int leastInterval(char[] tasks, int n) {
        int ans = 0;
        int[] q = new int[26];
        for(char c : tasks){
            q[c - 'A']++;
        }
        Arrays.sort(q);
        while(q[25] > 0){
            int i=0;
            while(i <= n){
                if(q[25] == 0){
                    break;
                }
                if(i < 26 && q[25 - i] > 0){
                    q[25 - i]--;
                }
                ans++;
                i++;
            }
            Arrays.sort(q);
        }
        return ans;
    }
}
