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
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>(); 
        
        for(int[] description : descriptions){  
            map.put(description[0], map.getOrDefault(description[0], new TreeNode(description[0])));
            map.put(description[1], map.getOrDefault(description[1], new TreeNode(description[1])));
            
            if(description[2] == 1){
                map.get(description[0]).left = map.get(description[1]);
            }
            else{
                map.get(description[0]).right = map.get(description[1]);                
            }       
            set.add(description[1]);          
        } 
        
        for (int key : map.keySet()) {
            if (!set.contains(key)) {
                return map.get(key);
            }
        }  
        return null;
    }
}