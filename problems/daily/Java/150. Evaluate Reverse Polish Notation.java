class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = -1;
        for(String token : tokens){
            if(token.equals("+")){
                stack[top - 1] += stack[top];
                top--;
            }else if(token.equals("-")){
                stack[top - 1] -= stack[top];
                top--;
            }else if(token.equals("*")){
                stack[top - 1] *= stack[top];
                top--;
            }else if(token.equals("/")){
                stack[top - 1] /= stack[top];
                top--;
            }else{
                stack[++top] = Integer.parseInt(token);
            }
        }
        return stack[top];
    }
}