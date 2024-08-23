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
    public int countPairs(TreeNode root, int distance) {
        int[] result = new int[1];
        dfs(root, distance, result);
        return result[0];
    }

    private List<Integer> dfs(TreeNode node, int distance, int[] result) {
        List<Integer> leafDistances = new ArrayList<>();
        
        if (node == null) return leafDistances;
        
        if (node.left == null && node.right == null) {
            leafDistances.add(1);
            return leafDistances;
        }
        
        List<Integer> leftDistances = dfs(node.left, distance, result);
        List<Integer> rightDistances = dfs(node.right, distance, result);
        
        for (int left : leftDistances) {
            for (int right : rightDistances) {
                if (left + right <= distance) {
                    result[0]++;
                }
            }
        }
        
        for (int left : leftDistances) {
            if (left + 1 <= distance) {
                leafDistances.add(left + 1);
            }
        }
        for (int right : rightDistances) {
            if (right + 1 <= distance) {
                leafDistances.add(right + 1);
            }
        }
        
        return leafDistances;
    }
}
