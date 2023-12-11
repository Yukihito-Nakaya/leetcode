class Solution {
    public int findSpecialInteger(int[] arr) {
        int l = arr.length;
        int c = 1;
        for(int i = 1; i < l;i++){
            if(arr[i] == arr[i - 1]){
                c++;
                if(c > l / 4)return arr[i];
            }else{
                c = 1;
            }
        }
        return arr[0];
    }
}