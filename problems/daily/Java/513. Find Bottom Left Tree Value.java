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
    public int findBottomLeftValue(TreeNode root) {
        return dfs(root,0,new int[]{0,0})[1];
    }
    public int[] dfs(TreeNode root,int depth, int[] ans){
        if(root == null){
            return ans;
        }
        if(depth > ans[0]){
            ans[0] = depth;
            ans[1] = root.val;
        }
        dfs(root.left,depth+1,ans);
        dfs(root.right,depth+1,ans);
        return ans;
    }
}