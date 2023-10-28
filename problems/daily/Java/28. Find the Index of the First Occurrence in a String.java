class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(),l2 = needle.length();
        if(l1 < l2) return -1;
        for(int i = 0; i <= l1 - l2; i++){
            int k = 0;
            while(k < l2 && haystack.charAt(i+k) == needle.charAt(k)){
                k++;
            }
            if(k == l2){
                return i;
            }
        }
        return -1;
    }
}