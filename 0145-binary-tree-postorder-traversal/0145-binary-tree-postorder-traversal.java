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
    public List<Integer> postorderTraversal(TreeNode root) {    
        List<Integer> list = new ArrayList<Integer>();
        traversal(root, list);
        return list;
    }
    
    private void traversal(TreeNode node, List<Integer> list) {
        
        if(node == null) return;
        
        traversal(node.left, list);
        traversal(node.right, list);
        list.add(node.val);
    }
}