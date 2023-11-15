/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return res(nums, 0 ,nums.length - 1);
    }

    public TreeNode res(int[] nums, int sp, int ep){
        if(sp == ep)return new TreeNode(nums[sp]);
        if(ep < sp)return null;
        int cp = (sp+ep) / 2;
        TreeNode ans = new TreeNode(nums[cp]);
        ans.left = res(nums,sp,cp -1);
        ans.right = res(nums,cp + 1,ep);
        return ans;
    }
}