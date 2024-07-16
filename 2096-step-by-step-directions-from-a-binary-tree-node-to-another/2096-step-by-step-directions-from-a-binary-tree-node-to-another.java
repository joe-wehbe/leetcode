class Solution {
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
        List<Character> pathToStart = new ArrayList<>();
        List<Character> pathToDest = new ArrayList<>();
        
        findPath(root, startValue, pathToStart);
        findPath(root, destValue, pathToDest);
        
        int i = 0;
        while (i < pathToStart.size() && i < pathToDest.size() && pathToStart.get(i) == pathToDest.get(i)) {
            i++;
        }
        
        StringBuilder result = new StringBuilder();
        for (int j = i; j < pathToStart.size(); j++) {
            result.append('U');
        }
        
        for (int j = i; j < pathToDest.size(); j++) {
            result.append(pathToDest.get(j));
        }
        
        return result.toString();
    }
    
    private boolean findPath(TreeNode node, int value, List<Character> path) {
        if (node == null) {
            return false;
        }
        
        if (node.val == value) {
            return true;
        }
        
        path.add('L');
        if (findPath(node.left, value, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        
        path.add('R');
        if (findPath(node.right, value, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        
        return false;
    }
}