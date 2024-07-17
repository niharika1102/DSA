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
    public TreeNode dfs(TreeNode root, HashSet<Integer> del, List<TreeNode> forest) {
        if (root == null) {
            return null;
        }

        root.left = dfs(root.left, del, forest);
        root.right = dfs(root.right, del, forest);

        if (!del.contains(root.val)) {
            return root;
        }

        //delete node
        if (root.left != null) {
            forest.add(root.left);
        }
        if (root.right != null) {
            forest.add(root.right);
        }
        root.left = null;
        root.right = null;

        return null;
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for (int d: to_delete) {
            set.add(d);
        }

        List<TreeNode> forest = new ArrayList<>();

        root = dfs(root, set, forest);

        if (root != null) {
            forest.add(root);
        }

        return forest;
    }
}