class Solution {
    public boolean isValid(String s) {
        StringBuilder tent = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            int l = tent.length();

            if(s.charAt(i) == ')' && l > 0){
                if(tent.charAt(l-1) == '('){
                    tent.delete(l-1,l);
                }else {
                    return false;
                }

            }else if(s.charAt(i) == '}' && l > 0){
                if(tent.charAt(l-1) == '{'){
                    tent.delete(l-1,l);
                }else {
                    return false;
                }

            }else if(s.charAt(i) == ']' && l >0){
                if(tent.charAt(l-1) == '['){
                    tent.delete(l-1,l);
                }else {
                    return false;
                }
                
            }else{
                tent.append(s.charAt(i));
            }
        }
        return tent.length() == 0;
    }
}