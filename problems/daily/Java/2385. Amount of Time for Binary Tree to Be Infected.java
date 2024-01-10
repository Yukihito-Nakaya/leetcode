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
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        dfs(root,0,map);
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        int ans = 0;
        Set<Integer> visited = new HashSet<>();
        visited.add(start);
        while(!q.isEmpty()){
            int size = q.size();
            while(size > 0){
                int curr = q.poll();
                for(int num : map.get(curr)){
                    if(!visited.contains(num)){
                        q.add(num);
                        visited.add(num);
                    }
                }
                size--;
            }
            ans++;
        }
        return ans -1;
    }
    void dfs(TreeNode root,int c, Map<Integer, Set<Integer>> map){
        if(root == null) return;
        if(!map.containsKey(root.val)) map.put(root.val, new HashSet<>());
        Set<Integer> adj = map.get(root.val);
        if(c != 0) adj.add(c);
        if(root.left != null) adj.add(root.left.val);
        if(root.right != null) adj.add(root.right.val);
        dfs(root.left,root.val,map);
        dfs(root.right,root.val,map);
    }
}