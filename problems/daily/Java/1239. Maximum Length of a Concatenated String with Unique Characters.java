class Solution {
    public int maxLength(List<String> arr) {
        List<Integer> dp = new ArrayList<>();
        dp.add(0);
        int ans = 0;
        for(String s : arr){
            int a = 0;
            boolean dup = false;
            for(char c : s.toCharArray()){
                int b = 1 << (c - 'a');
                if((a & b) > 0){
                    dup = true;
                    break;
                }
                a |= b;
            }
            if(dup)continue;
            for(int i = dp.size() - 1;i>=0;i--){
                int b = dp.get(i);
                if((a & b) > 0)continue;
                dp.add(a | b);
                ans = Math.max(ans,Integer.bitCount(a | b));
            }
        }
        return ans;
    }
}