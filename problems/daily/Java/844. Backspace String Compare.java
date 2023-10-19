class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i) == '#' && sb.length() > 0){
                sb.delete(sb.length()-1,sb.length());
                continue;
            }else if(s.charAt(i) == '#'){
                continue;
            }else{
                sb.append(s.charAt(i));
            }
        }
        for(int i = 0;i < t.length();i++){
            if(t.charAt(i) == '#' && tb.length() > 0){
                tb.delete(tb.length()-1,tb.length());
                continue;
            }else if(t.charAt(i) == '#'){
                continue;
            }else{
                tb.append(t.charAt(i));
            }
        }
        return (sb.toString()).contentEquals(tb);
    }
}