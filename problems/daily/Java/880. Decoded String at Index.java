
class Solution {
    public String decodeAtIndex(String s, int k) {
        long dsize = 0;
        int l = s.length();

        for(int i = 0;i<l;i++){
            if(Character.isDigit(s.charAt(i))){
                dsize *= s.charAt(i) - '0';
            }else{
                dsize++;
            }  
        }
        
        for(int i = l-1;i >= 0; i--){
            k = (int)(k % dsize);
            if(k == 0 && Character.isLetter(s.charAt(i))){
                return String.valueOf(s.charAt(i));
            }

            if(Character.isDigit(s.charAt(i))){
                dsize /= s.charAt(i) - '0';
            }else{
                dsize--;
            }
        }
        return "";
    }
}
//Memory 超過　
// class Solution {
//     public String decodeAtIndex(String s, int k) {
//         StringBuilder res = new StringBuilder("");
//         int c = 0;
//         for(int i = 0;i<s.length();i++){
//             if(Character.isDigit(s.charAt(i))){
//                 c = Character.getNumericValue(s.charAt(i)) - 1;
//                 StringBuilder add = new StringBuilder(res);
//                 for(int j = 0;j < c ;j++){
//                     res.append(add);
//                 }
//             }else{
//                 res.append(s.charAt(i));
//             }  
//             if(res.length() > k){
//                 break;
//             }
//         }
//         return res.substring(k-1,k);
//     }
// }