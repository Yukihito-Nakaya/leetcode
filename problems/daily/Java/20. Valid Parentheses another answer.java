lass Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> kind = new HashMap<>();
        kind.put(')','(');
        kind.put('}','{');
        kind.put(']','[');

        Stack<Character> tent = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char check = s.charAt(i); 
            if(check == '(' || check == '{' || check == '['){
                tent.push(check);
            } else {
                if(!tent.isEmpty() && tent.peek() == kind.get(check)){
                    tent.pop();
                }else{
                    return false;
                }
            }
        }

        return tent.size() == 0;
    }
}