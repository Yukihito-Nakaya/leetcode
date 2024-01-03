class Solution {
    public int numberOfBeams(String[] bank) {
        int prevRowCount = 0;
        int ans=0;

        for(String row : bank) {
            int curRowCount = calc(row);
            if(curRowCount==0) 
                continue;

            ans += curRowCount * prevRowCount;
            prevRowCount = curRowCount;
        }
        return ans;
    }

    private int calc(String s) {
        int count = 0;
        for(char c : s.toCharArray()) 
            count += c - '0';

        return count;
    }    
}