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
    public boolean isEvenOddTree(TreeNode root) {
        var q = new ArrayDeque<TreeNode>();
        q.offer(root);

        int lv = 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            int prev = lv % 2 == 0 ? 0 : Integer.MAX_VALUE;
            for(int i = 0; i < size; i++){
                var node = q.poll();
                if(lv % 2 == 0){
                    if(node.val % 2 == 0 || node.val <= prev){
                        return false;
                    }
                }else{
                    if(node.val % 2 != 0 || node.val >= prev){
                        return false;
                    }
                }
                prev = node.val;
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            lv++;
        }
        return true;

    }
}