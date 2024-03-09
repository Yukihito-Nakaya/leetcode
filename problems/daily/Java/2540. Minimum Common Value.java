class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int num1 = 0, num2 = 0;
        while((num1 < nums1.length) && (num2 < nums2.length)){
            if(nums1[num1] == nums2[num2]){
                return nums1[num1];
            }else{
                if(nums1[num1] < nums2[num2]){
                    num1++;
                }else{
                    num2++;
                }
            }
        }
        return -1;
    }
}