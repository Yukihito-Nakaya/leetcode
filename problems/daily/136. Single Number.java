class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++)ans ^= nums[i];
        return ans;
    }
}

// another solution
// class Solution {
//     public int singleNumber(int[] nums) {
//         if(nums.length == 1)return nums[0];
//         int ans = 0;
//         int check = 1;
//         int l = nums.length;
//         Arrays.sort(nums);
//         for(int i = 1; i < l; i++){
//             if(nums[i] == nums[i-1]){
//                 check++;
//             }else if(i == 1){
//                 return nums[0];
//             }else {
//                 if(check % 2 == 0){
//                     check = 1;
//                 }else{
//                    return nums[i - 1];
//                 }
//             }
//         }
//         return nums[l-1];
//     }
// }