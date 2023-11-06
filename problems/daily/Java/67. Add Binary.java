class Solution {
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int al = a.length() -1;
        int bl = b.length() -1;
        int tent = 0;
        while(al >= 0 || bl >= 0 || tent == 1){
            if(al >= 0) tent += a.charAt(al--) - '0';
            if(bl >= 0) tent += b.charAt(bl--) - '0';
            ans.append(tent % 2);
            tent /= 2;
        }
        return ans.reverse().toString();
    }
}