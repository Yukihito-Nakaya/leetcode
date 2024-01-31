class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int k = stack.pop();
                ans[k] = i - k;
            }
            stack.push(i);
        }
        return ans;
    }
}

//another solution
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        int[] next = new int[101];
        Arrays.fill(next, Integer.MAX_VALUE);
        for(int i = temperatures.length - 1; i >= 0; i--){
            int warmerIndex = Integer.MAX_VALUE;
            for(int t = temperatures[i] + 1; t <= 100; t++){
                if(next[t] < warmerIndex){
                    warmerIndex = next[t];
                }
            }
            if(warmerIndex < Integer.MAX_VALUE){
                ans[i] = warmerIndex - i;
            }
            next[temperatures[i]] = i;
        }
        return ans;
    }
}