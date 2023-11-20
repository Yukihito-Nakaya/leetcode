class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> val = new ArrayList<>();
            long pv = 1;
            val.add(1);
            for(int k = 1; k <= i;k++){
                long next = pv * (i - k + 1) / k;
                val.add((int) next);
                pv = next;
            }
            ans.add(val);
        }
        return ans;
    }
}