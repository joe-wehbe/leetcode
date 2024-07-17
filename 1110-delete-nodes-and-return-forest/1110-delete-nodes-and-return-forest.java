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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        
        List<TreeNode> roots = new ArrayList<>();
        Set<Integer> toDeleteSet = new HashSet<>();
        
        for(int value : to_delete)
            toDeleteSet.add(value);   
        
        root = deletion(root, roots, toDeleteSet);
        
        if(root != null)
            roots.add(root);
        
        return roots;
    }
    
    public TreeNode deletion(TreeNode node, List<TreeNode> roots, Set<Integer> toDelete){
        
        if(node == null)
            return null;
        
        node.left = deletion(node.left, roots, toDelete);
        node.right = deletion(node.right, roots, toDelete);
        
        if(toDelete.contains(node.val)){
            if(node.left != null)
                roots.add(node.left);
            if(node.right != null)
                roots.add(node.right);
            return null;
        }
        return node;
    }
}