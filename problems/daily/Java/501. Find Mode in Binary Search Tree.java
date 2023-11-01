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
    public int[] findMode(TreeNode root) {
        List<Integer> check = new ArrayList<>();
        Map<Integer,Integer> tent = new HashMap<>();
        line(root,check);
        int c = 0;

        for(int i:check){
            tent.put(i,tent.getOrDefault(i,0) + 1);
            c = Math.max(c,tent.get(i));
        }

        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : tent.entrySet()){
            if(entry.getValue() == c){
                res.add(entry.getKey());
            }
        }

        int[] ans = new int[res.size()];
        for(int i = 0; i<res.size();i++){
            ans[i] = res.get(i);
        }

        return ans;
    }

    private void line(TreeNode root,List<Integer> res){
        if(root == null) return;
        res.add(root.val);
        line(root.left,res);
        line(root.right,res);
    }
}