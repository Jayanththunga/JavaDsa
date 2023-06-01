// https://leetcode.com/problems/add-one-row-to-tree/
public class addOneRowToTree {
    private static TreeNode add(TreeNode root, int val, int depth) {
        if (depth < 1 || root == null)
            return root;
        if (depth == 1) {
            TreeNode nd = new TreeNode(val);
            TreeNode nnd = new TreeNode(val);
            if (root.left != null)
                nd.left = root.left;
            if (root.right != null)
                nnd.right = root.right;
            root.left = nd;
            root.right = nnd;
        } else {
            root.left = add(root.left, val, depth - 1);
            root.right = add(root.right, val, depth - 1);
        }

        return root;
    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (depth == 1) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        } else {
            return add(root, val, depth - 1);
        }
    }
}
