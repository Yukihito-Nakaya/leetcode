class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String sp = strs[0];
        String ep = strs[strs.length - 1];
        for(int i = 0; i < Math.min(sp.length(),ep.length()); i++){
            if(sp.charAt(i) != ep.charAt(i)){
                return ans.toString();
            }
            ans.append(sp.charAt(i));
        }
        return ans.toString();
    }
}