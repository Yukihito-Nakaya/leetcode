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
    public int diameterOfBinaryTree(TreeNode root) {
        return dfs(root)[1];
    }
    public int[] dfs(TreeNode root){
        if(root == null){
            return new int[]{0,0};
        }
        int[] left = dfs(root.left);
        int[] right = dfs(root.right);
        int[] ans = new int[2];
        ans[0] = Math.max(left[0],right[0]) + 1;
        ans[1] = Math.max(left[1],Math.max(right[1],left[0] + right[0]));
        return ans;
    }
}