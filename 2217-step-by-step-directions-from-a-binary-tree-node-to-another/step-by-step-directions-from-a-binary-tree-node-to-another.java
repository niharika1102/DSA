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
    public TreeNode lca(TreeNode root, int start, int end) {
        if (root == null || root.val == start || root.val == end) {
            return root;
        }

        TreeNode leftLCA = lca(root.left, start, end);
        TreeNode rightLCA = lca(root.right, start, end);

        if (leftLCA == null) {
            return rightLCA;
        }
        if (rightLCA == null) {
            return leftLCA;
        }

        return root;
    }

    public boolean getPath(TreeNode root, int t, StringBuilder res) {
        if (root == null) {
            return false;
        }
        if (root.val == t) {
            return true;
        }

        //left subtree
        res.append("L");
        if (getPath(root.left, t, res)) {
            return true;
        }

        //backtracking - path not found
        res.setLength(res.length() - 1);   //removing last character

        //right subtree
        res.append("R");
        if (getPath(root.right, t, res)) {
            return true;
        }

        //backtracking - path not found
        res.setLength(res.length() - 1);   //removing last character

        return false;
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode LCA = lca(root, startValue, destValue);
        StringBuilder toSrc = new StringBuilder();
        StringBuilder toDest = new StringBuilder();

        getPath(LCA, startValue, toSrc);
        getPath(LCA, destValue, toDest);

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < toSrc.length(); i++) {
            res.append("U");
        }
        res.append(toDest);
        return res.toString();
    }
}